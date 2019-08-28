package org.suggs.companydatafinderlib

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory

class CompaniesHouseTest {

    private val log = LoggerFactory.getLogger(this::class.java)

    var companiesHouse = CompaniesHouseProxy()

    @Test fun `retrieves data using companies house ID`() {
        var companyData = companiesHouse.getCompanyDataByID("00000006")
        log.debug("""Companies House Data: $companyData""")
        assertThat(companyData).isNotNull
    }
}