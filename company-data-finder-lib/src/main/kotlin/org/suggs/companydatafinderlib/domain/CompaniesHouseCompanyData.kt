package org.suggs.companydatafinderlib.domain

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
data class CompaniesHouseCompanyData(@JsonProperty("company_number") val companyNumber: String,
                                     @JsonProperty("company_name") val companyName: String,
                                     @JsonProperty("date_of_creation") val dateOfCreation: Date,
                                     @JsonProperty("company_status") val companyStatus: String,
                                     @JsonProperty("etag") val etag: String,
                                     @JsonProperty("registered_office_address") val registeredAddress: RegisteredAddress,
                                     @JsonProperty("links") val links: CompaniesHouseLinks) {

    val baseUrl = "https://api.companieshouse.gov.uk"
}

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
data class RegisteredAddress(@JsonProperty("address_line_1") val addressLine1: String,
                             @JsonProperty("address_line_2") val addressLine2: String,
                             @JsonProperty("locality") val locality: String,
                             @JsonProperty("postal_code") val postCode: String,
                             @JsonProperty("country") val country: String)

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
data class CompaniesHouseLinks(@JsonProperty("self") val self: String,
                               @JsonProperty("filing_history") val filingHistory: String,
                               @JsonProperty("officers") val officers: String,
                               @JsonProperty("charges") val charges: String)