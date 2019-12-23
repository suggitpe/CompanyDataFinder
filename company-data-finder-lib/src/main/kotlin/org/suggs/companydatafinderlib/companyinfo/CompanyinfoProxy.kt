package org.suggs.companydatafinderlib.companyinfo

import org.slf4j.LoggerFactory
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType.APPLICATION_PDF
import org.springframework.http.client.BufferingClientHttpRequestFactory
import org.springframework.http.client.SimpleClientHttpRequestFactory
import org.springframework.web.client.RestTemplate
import org.suggs.companydatafinderlib.companyinfo.domain.CompanyinfoCompanyProfile
import org.suggs.companydatafinderlib.companyinfo.domain.CompanyinfoDocumentMetadata
import org.suggs.companydatafinderlib.companyinfo.converters.CompanyinfoDocumentHttpMessageConverter
import org.suggs.companydatafinderlib.companyinfo.domain.CompanyinfoDocument
import org.suggs.companydatafinderlib.companyinfo.domain.CompanyinfoFilingHistoryList
import org.suggs.companydatafinderlib.companyinfo.interceptors.CompanyInfoAuthInterceptor
import org.suggs.companydatafinderlib.companyinfo.interceptors.RequestResponseLoggingInterceptor

class CompanyinfoProxy(private val authUsername: String) {

    private val restTemplate = createRestTemplateWithInterceptorsForAuthentication()
    private val log = LoggerFactory.getLogger(this::class.java)

    private fun createRestTemplateWithInterceptorsForAuthentication(): RestTemplate {
        val factory = BufferingClientHttpRequestFactory(SimpleClientHttpRequestFactory())
        val template = RestTemplate(factory)
        template.interceptors = listOf(
                RequestResponseLoggingInterceptor(),
                CompanyInfoAuthInterceptor(authUsername))
        template.messageConverters.add(CompanyinfoDocumentHttpMessageConverter())
        return template
    }

    /**
     * Retrieves company profile data for a given companies house company id
     */
    fun getCompanyDataFor(companyId: String): CompanyinfoCompanyProfile {
        log.debug("Retrieving company profile data for company id $companyId")
        val url = "https://api.companieshouse.gov.uk/company/$companyId"
        return when (val profile = restTemplate.getForObject(url, CompanyinfoCompanyProfile::class.java)) {
            null -> throw IllegalStateException("Could not create company profile for company number $companyId")
            else -> profile
        }
    }

    /**
     * Retrieves company filings history by for a given category.  Category types can be found at
     * @see <a href="https://developer.companieshouse.gov.uk/api/docs/company/company_number/filing-history/filingHistoryList-resource.html">FilingHistoryList</a>
     */
    fun getCompanyFilingHistoryFor(companyId: String, category: String, itemsPerPage: Int = 1): CompanyinfoFilingHistoryList {
        log.debug("Retrieving $category filing history for company number $companyId")
        val url = "https://api.companieshouse.gov.uk/company/$companyId/filing-history?category=$category&items_per_page=$itemsPerPage"
        return when (val filingHistory = restTemplate.getForObject(url, CompanyinfoFilingHistoryList::class.java)) {
            null -> throw IllegalStateException("Could not create filing history list for company number $companyId")
            else -> filingHistory
        }
    }

    /**
     * Retrieves document metadata from a defined url.  Document metadata url can be found from a @see CompaniesHouseFilingHistoryList
     */
    fun getDocumentMetadataFor(documentMetadataUrl: String): CompanyinfoDocumentMetadata {
        log.debug("Retrieving document metadata from url $documentMetadataUrl")
        return when (val documentMetadata = restTemplate.getForObject(documentMetadataUrl, CompanyinfoDocumentMetadata::class.java)) {
            null -> throw IllegalStateException("Could not build CompaniesHouseDocumentMetadata from url [$documentMetadataUrl]")
            else -> documentMetadata
        }
    }

    /**
     * Retrieves a document based on a defined url.
     */
    fun getDocumentFor(documentUrl: String): CompanyinfoDocument {
        log.debug("Retrieving document from url $documentUrl")
        return when (val document = restTemplate.exchange(documentUrl, HttpMethod.GET, createPdfAcceptingHeaders(), CompanyinfoDocument::class.java).body) {
            null -> throw java.lang.IllegalStateException("Could not retrieve document from url $documentUrl")
            else -> document
        }
    }

    /**
     * Navigates the various interfaces to find the latest filed document for a given company and criteria.
     */
    fun getLatestFiledDocumentForCategory(companyId: String, category: String): CompanyinfoDocument {
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



