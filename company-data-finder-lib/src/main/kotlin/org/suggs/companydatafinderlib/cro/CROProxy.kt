package org.suggs.companydatafinderlib.cro

import org.slf4j.LoggerFactory
import org.springframework.http.client.BufferingClientHttpRequestFactory
import org.springframework.http.client.SimpleClientHttpRequestFactory
import org.springframework.web.client.RestTemplate
import org.suggs.companydatafinderlib.cro.interceptors.RequestResponseLoggingInterceptor
import org.suggs.companydatafinderlib.cro.domain.CROCompanyProfile
import org.suggs.companydatafinderlib.cro.interceptors.CROAuthInterceptor

class CROProxy(private val authUsername: String) {

    private val restTemplate = createRestTemplateWithInterceptorsForAuthentication()
    private val log = LoggerFactory.getLogger(this::class.java)

    private fun createRestTemplateWithInterceptorsForAuthentication(): RestTemplate {
        val factory = BufferingClientHttpRequestFactory(SimpleClientHttpRequestFactory())
        val template = RestTemplate(factory)
        template.interceptors = listOf(
                CROAuthInterceptor(authUsername),
                RequestResponseLoggingInterceptor())
        return template
    }

    /**
     * Retrieves company profile data for a given cro company id
     */
    fun getCompanyDataFor(companyId: String): List<CROCompanyProfile> {
        log.debug("Retrieving company profile data for company id $companyId")
        val url = "https://services.cro.ie/cws/companies?company_num=$companyId"
        return when (val profile = restTemplate.getForEntity(url, Array<CROCompanyProfile>::class.java).body) {
            null -> throw IllegalStateException("Could not create company profile for company number $companyId")
            else -> profile.asList()
        }
    }


}