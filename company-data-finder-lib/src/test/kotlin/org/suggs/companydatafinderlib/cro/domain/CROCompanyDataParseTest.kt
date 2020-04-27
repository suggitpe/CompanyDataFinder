package org.suggs.companydatafinderlib.cro.domain

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.kotlin.readValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable
import org.slf4j.LoggerFactory

@DisplayName("CRO Response contains company data directly from CRO")
class CROCompanyDataParseTest {

    private val JSON = """[
        {"company_num":83740,
        "company_bus_ind":"C",
        "company_name":"FOSTER WHEELER IRELAND LIMITED",
        "company_addr_1":"C\/O, COOPERS, LYBRAND,",
        "company_addr_2":"FITZWILTON HOUSE,",
        "company_addr_3":"WILTON PLACE,",
        "company_addr_4":"DUBLIN 2.",
        "company_reg_date":"1981-07-08T00:00:00Z",
        "company_status_desc":"Dissolved",
        "company_status_date":"1993-11-19T00:00:00Z",
        "last_ar_date":"0001-01-01T00:00:00Z",
        "next_ar_date":"0001-01-01T00:00:00Z",
        "last_acc_date":"0001-01-01T00:00:00Z",
        "comp_type_desc":"Private limited by shares",
        "company_type_code":19,
        "company_status_code":8,
        "place_of_business":"",
        "eircode":""}
        ]""".trimMargin()

    private val mapper = ObjectMapper().registerModule(KotlinModule())
    private val log = LoggerFactory.getLogger(this::class.java)

    @Test
    fun `can create cro response from JSON`() {
        val responseList: List<CROCompanyProfile> = mapper.readValue(JSON)
        log.debug(responseList[0].croNumber)
        assertAll(
                Executable { assertThat(responseList[0].croBusinessName).isNotNull() },
                Executable { assertThat(responseList[0].croNumber).isEqualTo("83740") }
        )
    }
}