package org.suggs.companydatafinderlib

import org.slf4j.LoggerFactory
import org.springframework.http.HttpRequest
import org.springframework.http.client.*
import org.springframework.util.StreamUtils
import org.springframework.web.client.RestTemplate
import org.suggs.companydatafinderlib.domain.CompaniesHouseCompanyData
import java.io.IOException
import java.nio.charset.Charset
import java.util.*

class CompaniesHouseProxy {

    private val restTemplate = createRestTemplateWithInterceptorsForAuthentication()
    private val log = LoggerFactory.getLogger(this::class.java)

    fun getCompanyDataByID(id: String): CompaniesHouseCompanyData? {
        log.debug("""Retrieving company data for id [$id]""")
        return restTemplate.getForObject(buildCompaniesHouseCompanyUrl(id), CompaniesHouseCompanyData::class.java)
    }

    private fun buildCompaniesHouseCompanyUrl(id: String): String {
        return """https://api.companieshouse.gov.uk/company/$id"""
    }

    private fun createRestTemplateWithInterceptorsForAuthentication(): RestTemplate {
        val factory = BufferingClientHttpRequestFactory(SimpleClientHttpRequestFactory())
        val template = RestTemplate(factory)
        template.interceptors = listOf(
                //RequestResponseLoggingInterceptor(),
                CompaniesHouseAuthInterceptor("_JMZGS85jZjkf5sAQsM8ESbFdzo9sEyUqnnQIXmM"))
        return template
    }
}

class CompaniesHouseAuthInterceptor(val username: String) : ClientHttpRequestInterceptor {
    override fun intercept(request: HttpRequest, body: ByteArray, execution: ClientHttpRequestExecution): ClientHttpResponse {
        val auth = """$username:"""
        val encodedAuth = Base64.getEncoder().encodeToString(auth.toByteArray())
        request.headers.add("Authorization", """Basic $encodedAuth""")
        return execution.execute(request, body)
    }
}

class RequestResponseLoggingInterceptor : ClientHttpRequestInterceptor {

    private val log = LoggerFactory.getLogger(this::class.java)

    override fun intercept(request: HttpRequest, body: ByteArray, execution: ClientHttpRequestExecution): ClientHttpResponse {
        logRequest(request, body)
        val response = execution.execute(request, body)
        logResponse(response)
        return response
    }

    @Throws(IOException::class)
    private fun logRequest(request: HttpRequest, body: ByteArray) {
        if (log.isDebugEnabled()) {
            log.debug("===========================request begin================================================")
            log.debug("URI         : {}", request.uri)
            log.debug("Method      : {}", request.method)
            log.debug("Headers     : {}", request.headers)
            log.debug("Request body: {}", String(body, Charset.forName("UTF-8")))
            log.debug("==========================request end================================================")
        }
    }

    @Throws(IOException::class)
    private fun logResponse(response: ClientHttpResponse) {
        if (log.isDebugEnabled()) {
            log.debug("============================response begin==========================================")
            log.debug("Status code  : {}", response.statusCode)
            log.debug("Status text  : {}", response.statusText)
            log.debug("Headers      : {}", response.headers)
            log.debug("Response body: {}", StreamUtils.copyToString(response.body, Charset.defaultCharset()))
            log.debug("=======================response end=================================================")
        }
    }

}