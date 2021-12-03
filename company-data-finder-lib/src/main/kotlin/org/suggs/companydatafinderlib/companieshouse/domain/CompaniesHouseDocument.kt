package org.suggs.companydatafinderlib.companieshouse.domain

import org.slf4j.LoggerFactory
import org.springframework.http.MediaType
import java.io.File

data class CompaniesHouseDocument(val bytes: ByteArray,
                                  val contentType: MediaType?,
                                  val contentLength: Long,
                                  val eTag: String?,
                                  val lastModified: Long,
                                  val retrievedDate: Long) {

    private val log = LoggerFactory.getLogger(this::class.java)

    fun writeTo(fileLocation: String) {
        File(fileLocation).writeBytes(bytes)
        log.debug("Written ${bytes.size} to $fileLocation")
    }

    override fun toString(): String {
        return "CompaniesHouseDocument(bytes=${bytes.size}, " +
                "contentType=$contentType, " +
                "contentLength=$contentLength, " +
                "eTag=$eTag, " +
                "lastModified=$lastModified, " +
                "retrievedDate=$retrievedDate)"
    }
}
