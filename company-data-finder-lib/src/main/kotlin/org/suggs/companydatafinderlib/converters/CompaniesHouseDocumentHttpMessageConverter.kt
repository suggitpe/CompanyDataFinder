package org.suggs.companydatafinderlib.converters

import org.springframework.http.HttpInputMessage
import org.springframework.http.HttpOutputMessage
import org.springframework.http.MediaType
import org.springframework.http.converter.AbstractHttpMessageConverter
import org.springframework.util.StreamUtils
import org.suggs.companydatafinderlib.domain.CompaniesHouseDocument
import java.io.ByteArrayOutputStream


/**
 * HttpMessageConverter specifically for PDF documents`.
 */
class CompaniesHouseDocumentHttpMessageConverter : AbstractHttpMessageConverter<CompaniesHouseDocument>(MediaType.APPLICATION_PDF) {

    override fun supports(clazz: Class<*>): Boolean {
        return CompaniesHouseDocument::class.java == clazz
    }

    override fun writeInternal(document: CompaniesHouseDocument, outputMessage: HttpOutputMessage) {
        StreamUtils.copy(document.bytes, outputMessage.body)
    }

    override fun readInternal(clazz: Class<out CompaniesHouseDocument>, inputMessage: HttpInputMessage): CompaniesHouseDocument {
        val contentLength = inputMessage.headers.contentLength.toInt()
        val bos = ByteArrayOutputStream(if (contentLength >= 0) contentLength else StreamUtils.BUFFER_SIZE)
        StreamUtils.copy(inputMessage.body, bos)
        return CompaniesHouseDocument(bos.toByteArray(),
                inputMessage.headers.contentType,
                inputMessage.headers.contentLength,
                inputMessage.headers.eTag,
                inputMessage.headers.lastModified,
                inputMessage.headers.date)
    }

    override fun getContentLength(document: CompaniesHouseDocument, contentType: MediaType?): Long? {
        return document.bytes.size.toLong()
    }

}