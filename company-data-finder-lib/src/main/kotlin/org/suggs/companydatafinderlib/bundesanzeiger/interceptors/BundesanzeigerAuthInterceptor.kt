package org.suggs.companydatafinderlib.bundesanzeiger.interceptors

import org.springframework.http.HttpRequest
import org.springframework.http.client.ClientHttpRequestExecution
import org.springframework.http.client.ClientHttpRequestInterceptor
import org.springframework.http.client.ClientHttpResponse

class BundesanzeigerAuthInterceptor(private val authToken: String) : ClientHttpRequestInterceptor {
    override fun intercept(request: HttpRequest, body: ByteArray, execution: ClientHttpRequestExecution): ClientHttpResponse {
        request.headers.add("Authorization", "Bearer $authToken")
        request.headers.add("Accept", "application/vnd.echobot+json; version=1")
        return execution.execute(request, body)
    }

}