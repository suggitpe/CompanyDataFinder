package org.suggs.companydatafinderlib.kvk.domain

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
data class KVKCompanyProfile(@JsonProperty("data") val kvkData: KVKData)


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
data class KVKData(@JsonProperty("items") val kvkDataItems: List<KVKDataItem>)


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
data class KVKDataItem(@JsonProperty("kvkNumber") val kvkNumber: String,
                       @JsonProperty("tradeNames") val kvkTradeNames: KVKTradeNames,
                       @JsonProperty("addresses") val kvkAddresses: List<KVKAddress>,
                       @JsonProperty("foundationDate") val kvkFoundationDate: Date)


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
data class KVKTradeNames(@JsonProperty("businessName") val kvkBusinessName: String,
                         @JsonProperty("currentTradeNames") val kvkTradeNames: List<String>)


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
data class KVKAddress(@JsonProperty("street") val kvkStreetAddress: String,
                      @JsonProperty("houseNumber") val kvkHouseNumber: String,
                      @JsonProperty("postalCode") val kvkPostCode: String,
                      @JsonProperty("city") val kvkCity: String,
                      @JsonProperty("country") val kvkCountry: String)