package org.suggs.companydatafinderlib

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import org.suggs.companydatafinderlib.domain.CompaniesHouseDocument

@DisplayName("Companies House Proxy allows us to")
class CompaniesHouseTest {

    private val log = LoggerFactory.getLogger(this::class.java)
    private var companiesHouse = CompaniesHouseProxy()

    @Test fun `retrieve data using companies house ID`() {
        val companyData = companiesHouse.getCompanyDataFor("02868209")
        log.debug("""Companies House Data: $companyData""")
        assertThat(companyData).isNotNull
    }

    @Test fun `retrieve incorporation filing history using companies house ID`() {
        val filingHistory = companiesHouse.getCompanyFilingHistoryFor("02868209", "incorporation")
        log.debug("""Filing History: $filingHistory""")
        assertThat(filingHistory).isNotNull
    }

    @Test fun `retrieves address filing history using companies house ID`() {
        val filingHistory = companiesHouse.getCompanyFilingHistoryFor("02868209", "address")
        log.debug("""Filing History: $filingHistory""")
        assertThat(filingHistory).isNotNull
    }

    @Test fun `read document metadata from the last filed incorporation information to retrieve the document`() {
        val document = retrieveLastFiledDocumentForCategory("02868209", "incorporation")
        log.debug(document.toString())
        document.writeTo("/tmp/02868209-incorporation.pdf")
    }

    @Test fun `read document metadata from the last filed address information to retrieve the document`() {
        val document = retrieveLastFiledDocumentForCategory("02868209", "address")
        log.debug(document.toString())
        document.writeTo("/tmp/02868209-address.pdf")
    }

    private fun retrieveLastFiledDocumentForCategory(companyId: String, category: String): CompaniesHouseDocument {
        val filingHistory = companiesHouse.getCompanyFilingHistoryFor(companyId, category)
        val documentMetadataLink = filingHistory.latestFiledItemUrl()
        val documentMetadata = companiesHouse.getDocumentMetadataFor(documentMetadataLink)
        return companiesHouse.getDocumentFor(documentMetadata.documentUrl())
    }

    @Test fun `read a document from companies house`() {
        val document = companiesHouse.getDocumentFor("https://document-api.companieshouse.gov.uk/document/lakwoqyUeDVLMpj-Xg6XbD0C318iqLfKE-W0pG3npgY/content")
        assertThat(document.contentLength).isGreaterThan(0)
        log.debug(document.toString())
    }
}