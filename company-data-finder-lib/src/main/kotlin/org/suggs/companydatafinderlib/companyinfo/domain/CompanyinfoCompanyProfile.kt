package org.suggs.companydatafinderlib.companyinfo.domain

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
data class CompanyinfoCompanyProfile(@JsonProperty("company_number") val companyNumber: String,
                                        @JsonProperty("date_of_creation") val dateOfCreation: Date,
                                        @JsonProperty("type") val type: String,
                                        @JsonProperty("jurisdiction") val jurisdiction: String,
                                        @JsonProperty("company_name") val companyName: String,
                                        @JsonProperty("registered_office_address") val registeredAddress: RegisteredAddress,
                                        @JsonProperty("sic_codes") val sicCodes: List<String>,
                                        @JsonProperty("company_status") val companyStatus: String,
                                        @JsonProperty("etag") val etag: String,
                                        @JsonProperty("links") val links: Map<String, String>)

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
data class RegisteredAddress(@JsonProperty("address_line_1") val addressLine1: String?,
                             @JsonProperty("address_line_2") val addressLine2: String?,
                             @JsonProperty("locality") val locality: String?,
                             @JsonProperty("postal_code") val postCode: String?,
                             @JsonProperty("country") val country: String?)