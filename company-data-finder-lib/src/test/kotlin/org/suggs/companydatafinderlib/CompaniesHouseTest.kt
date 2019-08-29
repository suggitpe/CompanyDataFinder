package org.suggs.companydatafinderlib

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory

@DisplayName("Companies House Proxy allows us to")
class CompaniesHouseTest {

    private val log = LoggerFactory.getLogger(this::class.java)

    var companiesHouse = CompaniesHouseProxy()

    @Test fun `retrieve data using companies house ID`() {
        var companyData = companiesHouse.getCompanyDataFor("02868209")
        log.debug("""Companies House Data: $companyData""")
        assertThat(companyData).isNotNull
    }

    @Test fun `retrieve incorporation filing history using companies house ID`() {
        var filingHistory = companiesHouse.getCompanyFilingHistoryFor("02868209", "incorporation")
        log.debug("""Filing History: $filingHistory""")
        assertThat(filingHistory).isNotNull
    }

    @Test fun `retrieves address filing history using companies house ID`(){
        var filingHistory = companiesHouse.getCompanyFilingHistoryFor("02868209", "address")
        log.debug("""Filing History: $filingHistory""")
        assertThat(filingHistory).isNotNull
    }

    @Test fun `read document metadata from the first filed incorporation information to retrieve the document`() {
        val filingHistory = companiesHouse.getCompanyFilingHistoryFor("02868209", "incorporation")
        val documentMetadataLink = filingHistory.latestFiledItemUrl()
        val documentMetadata = companiesHouse.getDocumentMetadataFor(documentMetadataLink)
        val document = companiesHouse.getDocumentFor(documentMetadata.documentUrl())
        log.debug(document.toString())
    }
}