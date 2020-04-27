package org.suggs.companydatafinderlib.kvk.domain

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.kotlin.readValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable
import org.slf4j.LoggerFactory

@DisplayName("KVK Response contains company data directly from KVK")
class KVKCompanyDataParseTest {

    private val JSON = """{
    |"apiVersion": "2.0",
    |"meta":{},
    |"data":{
     |"itemsPerPage": 1,
     |"startPage": 1,
     |"totalItems": 2,
     |"nextLink": "https://api.kvk.nl/api/v2/profile/companies?kvkNumber=69599084&startPage=2",
     |"items": [{
         |"kvkNumber": "69599084",
         |"branchNumber": "000038509504",
         |"tradeNames":{
           |"businessName": "Test EMZ Dagobert",
           |"currentTradeNames": [ "Test EMZ Dagobert",
            |"Tweede handelsnaam 1MZ",
            |"Derde handelsnaam 1MZ",
            |"Vierde handelsnaam 1MZ"] 
        |},
         |"legalForm": "Eenmanszaak",
         |"businessActivities": [{
             |"sbiCode": "1011",
             |"sbiCodeDescription": "Slachterijen (geen pluimvee-)",
             |"isMainSbi": true},{
             |"sbiCode": "1012",
             |"sbiCodeDescription": "Pluimveeslachterijen",
             |"isMainSbi": false},{
             |"sbiCode": "1013",
             |"sbiCodeDescription": "Vleesverwerking (niet tot maaltijden)",
             |"isMainSbi": false}],
         |"hasEntryInBusinessRegister": true,
         |"hasCommercialActivities": true,
         |"hasNonMailingIndication": true,
         |"isLegalPerson": false,
         |"isBranch": true,
         |"isMainBranch": true,
         |"employees": 1,
         |"foundationDate": "20170108",
         |"registrationDate": "20170710",
         |"addresses": [{
             |"type": "vestigingsadres",
             |"bagId": "0363010000951555",
             |"street": "Abebe Bikilalaan",
             |"houseNumber": "17",
             |"houseNumberAddition": "",
             |"postalCode": "1034WL",
             |"city": "Amsterdam",
             |"country": "Nederland",
             |"gpsLatitude": 52.403176952488096,
             |"gpsLongitude": 4.917604057883805,
             |"rijksdriehoekX": 123042,
             |"rijksdriehoekY": 490697,
             |"rijksdriehoekZ": 0 
          |} 
        |] 
      |} 
    |] 
  |} 
|}
""".trimMargin()

    private val mapper = ObjectMapper().registerModule(KotlinModule())
    private val log = LoggerFactory.getLogger(this::class.java)

    @Test
    fun `can create kvk response from JSON`() {
        val response = mapper.readValue<KVKCompanyProfile>(JSON)
        log.debug(response.toString())
        assertAll(
                Executable { assertThat(response.kvkData.kvkDataItems[0].kvkTradeNames.kvkBusinessName).isNotNull() },
                Executable { assertThat(response.kvkData.kvkDataItems[0].kvkNumber).isEqualTo("69599084") },
                Executable { assertThat(response.kvkData.kvkDataItems[0].kvkFoundationDate).isNotNull() },
                Executable { assertThat(response.kvkData.kvkDataItems[0].kvkAddresses[0].kvkStreetAddress).isNotNull() }

        )
    }
}