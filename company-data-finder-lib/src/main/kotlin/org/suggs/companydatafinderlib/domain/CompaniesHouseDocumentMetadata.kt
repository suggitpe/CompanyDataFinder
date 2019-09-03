package org.suggs.companydatafinderlib.domain

import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

data class CompaniesHouseDocumentMetadata(@JsonProperty("company_number") val companyNumber: String,
                                          @JsonProperty("barcode") val barcode: String,
                                          @JsonProperty("created_at") val createdAt: Date,
                                          @JsonProperty("category") val category: String,
                                          @JsonProperty("etag") val etag: String,
                                          @JsonProperty("links") val links: Map<String, String>) {

    fun documentUrl(): String {
        return when (val documentLink = links["document"]) {
            null -> throw IllegalStateException("Could not find document link in document metadata")
            else -> documentLink
        }
    }
}
