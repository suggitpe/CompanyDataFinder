package org.suggs.companydatafinderlib.interceptors

import org.springframework.http.HttpRequest
import org.springframework.http.client.ClientHttpRequestExecution
import org.springframework.http.client.ClientHttpRequestInterceptor
import org.springframework.http.client.ClientHttpResponse
import java.util.*

class CompaniesHouseAuthInterceptor(private val username: String) : ClientHttpRequestInterceptor {
    override fun intercept(request: HttpRequest, body: ByteArray, execution: ClientHttpRequestExecution): ClientHttpResponse {
        val auth = """$username:"""
        val encodedAuth = Base64.getEncoder().encodeToString(auth.toByteArray())
        request.headers.add("Authorization", """Basic $encodedAuth""")
        return execution.execute(request, body)
    }
}