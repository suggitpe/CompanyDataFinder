package org.suggs.companydatafinderlib.kvk

import org.slf4j.LoggerFactory
import org.springframework.http.client.BufferingClientHttpRequestFactory
import org.springframework.http.client.SimpleClientHttpRequestFactory
import org.springframework.web.client.RestTemplate
import org.suggs.companydatafinderlib.kvk.interceptors.RequestResponseLoggingInterceptor
import org.suggs.companydatafinderlib.kvk.domain.KVKCompanyProfile
import org.suggs.companydatafinderlib.kvk.interceptors.KVKAuthInterceptor

class KVKProxy(private val authUsername: String, private val authPassword: String) {

    private val restTemplate = createRestTemplateWithInterceptorsForAuthentication()
    private val log = LoggerFactory.getLogger(this::class.java)

    private fun createRestTemplateWithInterceptorsForAuthentication(): RestTemplate {
        val factory = BufferingClientHttpRequestFactory(SimpleClientHttpRequestFactory())
        val template = RestTemplate(factory)
        template.interceptors = listOf(
                RequestResponseLoggingInterceptor(),
                KVKAuthInterceptor(authUsername, authPassword))
        return template
    }

    /**
     * Retrieves company profile data for a given kvk company id
     */
    fun getCompanyDataFor(companyId: String): KVKCompanyProfile {
        log.debug("Retrieving company profile data for company id $companyId")
        val url = "https://api.kvk.nl:443/api/v2/testprofile/companies?kvkNumber=$companyId"
        return when (val profile = restTemplate.getForObject(url, KVKCompanyProfile::class.java)) {
            null -> throw IllegalStateException("Could not create company profile for company number $companyId")
            else -> profile
        }
    }


}