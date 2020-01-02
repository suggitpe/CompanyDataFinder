package org.suggs.companydatafinderlib.companieshouse.domain

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

/**
 * @see <a href="https://developer.companieshouse.gov.uk/api/docs/company/company_number/filing-history/filingHistoryList-resource.html">FilingHistoryList</a>
 * for details of available fields for mapping
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
data class CompaniesHouseFilingHistoryList(@JsonProperty("start_index") val startIndex: Int,
                                           @JsonProperty("filing_history_status") val filingHistoryStatus: String,
                                           @JsonProperty("items_per_page") val itemsPerPage: Int,
                                           @JsonProperty("items") val items: List<FilingHistoryItem>) {

    fun latestFiledItemUrl(): String {
        return when (val url = items.maxBy { it.date }!!.links["document_metadata"]) {
            null -> throw IllegalStateException("Could not extract document metadata link from filing history list")
            else -> url
        }
    }
}

/**
 * @see <a href="https://developer.companieshouse.gov.uk/api/docs/company/company_number/filing-history/filingHistoryItem-resource.html">FilingHistoryItem</a>
 * for details of available fields for mapping
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
data class FilingHistoryItem(@JsonProperty("date") val date: Date,
                             @JsonProperty("links") val links: Map<String, String>)