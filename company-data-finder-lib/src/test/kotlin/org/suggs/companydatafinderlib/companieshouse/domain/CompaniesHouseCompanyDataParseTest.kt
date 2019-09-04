package org.suggs.companydatafinderlib.companieshouse.domain

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.kotlin.readValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable
import org.slf4j.LoggerFactory

@DisplayName("Companies House Response contains company data directly from CH")
class CompaniesHouseCompanyDataParseTest {

    private val JSON = """{
        |"company_number":"00000006",
        |"date_of_creation":"1862-10-25",
        |"last_full_members_list_date":"1986-07-02",
        |"type":"private-unlimited-nsc",
        |"jurisdiction":"england-wales",
        |"company_name":"MARINE AND GENERAL MUTUAL LIFE ASSURANCE SOCIETY",
        |"registered_office_address":{
            |"postal_code":"EC4N 6AF",
            |"address_line_2":"78 Cannon Street",
            |"country":"England",
            |"address_line_1":"Cms Cameron Mckenna Llp Cannon Place",
            |"locality":"London"
        |},
        |"accounts":{
            |"accounting_reference_date":{
                |"month":"12",
                |"day":"31"
            |},
            |"last_accounts":{
                |"made_up_to":"2014-12-31",
                |"type":"full",
                |"period_end_on":"2014-12-31"
            |}
        |},
        |"sic_codes":["65110"],
        |"undeliverable_registered_office_address":false,
        |"has_insolvency_history":false,
        |"company_status":"dissolved",
        |"etag":"0f74ad6c3c366269ac39899e0939851b2ebd15e3",
        |"has_charges":true,
        |"links":{
            |"self":"/company/00000006",
            |"filing_history":"/company/00000006/filing-history",
            |"officers":"/company/00000006/officers",
            |"charges":"/company/00000006/charges"
        |},
        |"registered_office_is_in_dispute":false,
        |"date_of_cessation":"2018-07-10",
        |"can_file":false}""".trimMargin()

    private val mapper = ObjectMapper().registerModule(KotlinModule())
    private val log = LoggerFactory.getLogger(this::class.java)

    @Test
    fun `can create companies house response from JSON`() {
        val response = mapper.readValue<CompaniesHouseCompanyProfile>(JSON)
        log.debug(response.toString())
        assertAll(
                Executable { assertThat(response.companyName).isNotNull() },
                Executable { assertThat(response.companyNumber).isEqualTo("00000006") },
                Executable { assertThat(response.dateOfCreation).isNotNull() },
                Executable { assertThat(response.registeredAddress).isNotNull() }

        )
    }
}