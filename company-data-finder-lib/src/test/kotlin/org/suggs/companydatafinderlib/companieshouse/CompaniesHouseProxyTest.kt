package org.suggs.companydatafinderlib.companieshouse

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import org.suggs.companydatafinderlib.util.ApplicationConfiguration

@DisplayName("Companies House Proxy allows us to")
class CompaniesHouseProxyTest {

    private val log = LoggerFactory.getLogger(this::class.java)
    private val config = ApplicationConfiguration("companieshouse-cfg.yml")
    private var companiesHouse = CompaniesHouseProxy(config.get("auth"))

    @Test fun `retrieve data using companies house ID`() {
        val companyData = companiesHouse.getCompanyDataFor("02868209")
        log.debug("Companies House Data: $companyData")
        assertThat(companyData).isNotNull
    }

    @Test fun `retrieve incorporation filing history using companies house ID`() {
        val filingHistory = companiesHouse.getCompanyFilingHistoryFor("02868209", "incorporation")
        log.debug("Filing History: $filingHistory")
        assertThat(filingHistory).isNotNull
    }

    @Test fun `retrieves address filing history using companies house ID`() {
        val filingHistory = companiesHouse.getCompanyFilingHistoryFor("02868209", "address")
        log.debug("Filing History: $filingHistory")
        assertThat(filingHistory).isNotNull
    }

    @Test fun `read document metadata from the last filed incorporation information to retrieve the document`() {
        val document = companiesHouse.getLatestFiledDocumentForCategory("02868209", "incorporation")
        log.debug(document.toString())
        document.writeTo("/tmp/02868209-incorporation.pdf")
    }

    @Test fun `read document metadata from the last filed address information to retrieve the document`() {
        val document = companiesHouse.getLatestFiledDocumentForCategory("02868209", "address")
        log.debug(document.toString())
        document.writeTo("/tmp/02868209-address.pdf")
    }

    @Test fun `read a document from companies house`() {
        val document = companiesHouse.getDocumentFor("https://document-api.companieshouse.gov.uk/document/lakwoqyUeDVLMpj-Xg6XbD0C318iqLfKE-W0pG3npgY/content")
        assertThat(document.contentLength).isGreaterThan(0)
        log.debug(document.toString())
    }

    @Test fun `playing around trying to understand what documents are stored are where`(){
        val lastTenFiledDocMetadataUrls = companiesHouse.getCompanyFilingHistoryFor("02868209", "address", 10).latestTenFiledItemsUrls()
        log.info("Retrieved last ${lastTenFiledDocMetadataUrls.count()} document links")
        val documents = lastTenFiledDocMetadataUrls.map { companiesHouse.getDocumentMetadataFor(it!!).documentUrl() }.map { companiesHouse.getDocumentFor(it) }
        log.info("Document urls ${documents.map { it.contentLength }}")
        documents.forEach { it.writeTo("/tmp/${it.eTag}") }
    }
}