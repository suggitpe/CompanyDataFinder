package org.suggs.companydatafinderlib.bundesanzeiger

import org.slf4j.LoggerFactory
import org.springframework.http.client.BufferingClientHttpRequestFactory
import org.springframework.http.client.SimpleClientHttpRequestFactory
import org.springframework.web.client.RestTemplate
import org.suggs.companydatafinderlib.bundesanzeiger.domain.BunsesanzeigerCompanyProfile
import org.suggs.companydatafinderlib.bundesanzeiger.interceptors.BundesanzeigerAuthInterceptor
import org.suggs.companydatafinderlib.companieshouse.domain.CompaniesHouseCompanyProfile
import org.suggs.companydatafinderlib.util.RequestResponseLoggingInterceptor

class BundesanzeigerProxy(private val authToken: String) {

    private val restTemplate = createRestTemplateWithInterceptorsForAuthentication()
    private val log = LoggerFactory.getLogger(this::class.java)
    private val urlRoot = "https://api.echobot.de"

    private fun createRestTemplateWithInterceptorsForAuthentication(): RestTemplate {
        val factory = BufferingClientHttpRequestFactory(SimpleClientHttpRequestFactory())
        val template = RestTemplate(factory)
        template.interceptors = listOf(
                RequestResponseLoggingInterceptor(),
                BundesanzeigerAuthInterceptor(authToken))
        return template
    }

    fun getCompanyDataFor(companyId: String): BunsesanzeigerCompanyProfile {
        log.debug("Retrieving company profile data for company id $companyId")
        val url = "$urlRoot/companies/$companyId"
        return when (val profile = restTemplate.getForObject(url, BunsesanzeigerCompanyProfile::class.java)) {
            null -> throw IllegalStateException("Could not create company profile for company number $companyId")
            else -> profile
        }
    }
}