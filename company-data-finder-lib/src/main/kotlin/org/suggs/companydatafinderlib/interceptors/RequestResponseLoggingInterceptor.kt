package org.suggs.companydatafinderlib.interceptors

import org.slf4j.LoggerFactory
import org.springframework.http.HttpRequest
import org.springframework.http.MediaType
import org.springframework.http.client.ClientHttpRequestExecution
import org.springframework.http.client.ClientHttpRequestInterceptor
import org.springframework.http.client.ClientHttpResponse
import org.springframework.util.StreamUtils
import java.io.IOException
import java.nio.charset.Charset

class RequestResponseLoggingInterceptor : ClientHttpRequestInterceptor {

    private val log = LoggerFactory.getLogger(this::class.java)

    override fun intercept(request: HttpRequest, body: ByteArray, execution: ClientHttpRequestExecution): ClientHttpResponse {
        logRequest(request, body)
        val response = execution.execute(request, body)
        logResponse(response)
        return response
    }

    @Throws(IOException::class)
    private fun logRequest(request: HttpRequest, body: ByteArray) {
        if (log.isDebugEnabled) {
            log.debug("===========================request begin================================================")
            log.debug("URI         : ${request.uri}")
            log.debug("Method      : ${request.method}")
            log.debug("Headers     : ${request.headers}")
            log.debug("Request body: ${String(body, Charset.forName("UTF-8"))}")
            log.debug("==========================request end================================================")
        }
    }

    @Throws(IOException::class)
    private fun logResponse(response: ClientHttpResponse) {
        if (log.isDebugEnabled) {
            log.debug("============================response begin==========================================")
            log.debug("Status code  : ${response.statusCode}")
            log.debug("Status text  : ${response.statusText}")
            log.debug("Headers      : ${response.headers}")
            if (response.headers.contentType!!.compareTo(MediaType.APPLICATION_JSON) == 0) {
                log.debug("Response body: ${StreamUtils.copyToString(response.body, Charset.defaultCharset())}")
            } else {
                log.debug("Response body: {huge blob of data}")
            }
            log.debug("=======================response end=================================================")
        }
    }

}