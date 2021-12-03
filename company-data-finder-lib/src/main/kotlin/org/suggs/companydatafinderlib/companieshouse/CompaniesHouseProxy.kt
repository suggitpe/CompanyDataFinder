package org.suggs.companydatafinderlib.companieshouse

import org.slf4j.LoggerFactory
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType.APPLICATION_PDF
import org.springframework.http.client.BufferingClientHttpRequestFactory
import org.springframework.http.client.SimpleClientHttpRequestFactory
import org.springframework.web.client.RestTemplate
import org.suggs.companydatafinderlib.companieshouse.converters.CompaniesHouseDocumentHttpMessageConverter
import org.suggs.companydatafinderlib.companieshouse.domain.CompaniesHouseCompanyProfile
import org.suggs.companydatafinderlib.companieshouse.domain.CompaniesHouseDocument
import org.suggs.companydatafinderlib.companieshouse.domain.CompaniesHouseDocumentMetadata
import org.suggs.companydatafinderlib.companieshouse.domain.CompaniesHouseFilingHistoryList
import org.suggs.companydatafinderlib.companieshouse.interceptors.CompaniesHouseAuthInterceptor
import org.suggs.companydatafinderlib.util.RequestResponseLoggingInterceptor

class CompaniesHouseProxy(private val authUsername: String) {

    private val restTemplate = createRestTemplateWithInterceptorsForAuthentication()
    private val log = LoggerFactory.getLogger(this::class.java)
    private val urlRoot = "https://api.companieshouse.gov.uk"

    private fun createRestTemplateWithInterceptorsForAuthentication(): RestTemplate {
        val factory = BufferingClientHttpRequestFactory(SimpleClientHttpRequestFactory())
        val template = RestTemplate(factory)
        template.interceptors = listOf(
                RequestResponseLoggingInterceptor(),
                CompaniesHouseAuthInterceptor(authUsername))
        template.messageConverters.add(CompaniesHouseDocumentHttpMessageConverter())
        return template
    }

    /**
     * Retrieves company profile data for a given companies house company id
     */
    fun getCompanyDataFor(companyId: String): CompaniesHouseCompanyProfile {
        log.debug("Retrieving company profile data for company id $companyId")
        val url = "$urlRoot/company/$companyId"
        return when (val profile = restTemplate.getForObject(url, CompaniesHouseCompanyProfile::class.java)) {
            null -> throw IllegalStateException("Could not create company profile for company number $companyId")
            else -> profile
        }
    }

    /**
     * Retrieves company filings history by for a given category.  Category types can be found at
     * @see <a href="https://developer.companieshouse.gov.uk/api/docs/company/company_number/filing-history/filingHistoryList-resource.html">FilingHistoryList</a>
     */
    fun getCompanyFilingHistoryFor(companyId: String, category: String, itemsPerPage: Int = 1): CompaniesHouseFilingHistoryList {
        log.debug("Retrieving $category filing history for company number $companyId")
        val url = "$urlRoot/company/$companyId/filing-history?category=$category&items_per_page=$itemsPerPage"
        return when (val filingHistory = restTemplate.getForObject(url, CompaniesHouseFilingHistoryList::class.java)) {
            null -> throw IllegalStateException("Could not create filing history list for company number $companyId")
            else -> filingHistory
        }
    }

    /**
     * Retrieves document metadata from a defined url.  Document metadata url can be found from a @see CompaniesHouseFilingHistoryList
     */
    fun getDocumentMetadataFor(documentMetadataUrl: String): CompaniesHouseDocumentMetadata {
        log.debug("Retrieving document metadata from url $documentMetadataUrl")
        return when (val documentMetadata = restTemplate.getForObject(documentMetadataUrl, CompaniesHouseDocumentMetadata::class.java)) {
            null -> throw IllegalStateException("Could not build CompaniesHouseDocumentMetadata from url [$documentMetadataUrl]")
            else -> documentMetadata
        }
    }

    /**
     * Retrieves a document based on a defined url.
     */
    fun getDocumentFor(documentUrl: String): CompaniesHouseDocument {
        log.debug("Retrieving document from url $documentUrl")
        return when (val document = restTemplate.exchange(documentUrl, HttpMethod.GET, createPdfAcceptingHeaders(), CompaniesHouseDocument::class.java).body) {
            null -> throw java.lang.IllegalStateException("Could not retrieve document from url $documentUrl")
            else -> document
        }
    }

    /**
     * Navigates the various interfaces to find the latest filed document for a given company and criteria.
     */
    fun getLatestFiledDocumentForCategory(companyId: String, category: String): CompaniesHouseDocument {
        val documentMetadataLink = getCompanyFilingHistoryFor(companyId, category).latestFiledItemUrl()
        val documentUrl = getDocumentMetadataFor(documentMetadataLink).documentUrl()
        return getDocumentFor(documentUrl)
    }

    private fun createPdfAcceptingHeaders(): HttpEntity<String> {
        val headers = HttpHeaders()
        headers.accept = listOf(APPLICATION_PDF)
        return HttpEntity(headers)
    }
}



