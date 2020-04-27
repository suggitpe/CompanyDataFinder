package org.suggs.companydatafinderlib.cro.domain

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
data class CROCompanyProfile(@JsonProperty("company_num") val croNumber: String,
                             @JsonProperty("company_name") val croBusinessName: String,
                             @JsonProperty("company_addr_1") val croAddress1: String,
                             @JsonProperty("company_addr_2") val croAddress2: String,
                             @JsonProperty("company_addr_3") val croAddress3: String,
                             @JsonProperty("company_addr_4") val croAddress4: String,
                             @JsonProperty("company_reg_date") val croRegisteredDate: Date)
