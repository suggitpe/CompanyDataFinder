package org.suggs.companydatafinderlib.companyinfo

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import org.suggs.companydatafinderlib.companyinfo.CompanyinfoProxy
import org.yaml.snakeyaml.Yaml

@DisplayName("Companyinfo Proxy allows us to")
class CompanyInfoTest {

    private val log = LoggerFactory.getLogger(this::class.java)
    private val config = loadConfig()
    private var companyinfo = CompanyinfoProxy(config.get("auth"))

    @Test fun `retrieve data using  ID`() {
        val companyData = companyinfo.getCompanyDataFor("02868209")
        log.debug("Companies House Data: $companyData")
        assertThat(companyData).isNotNull
    }

    @Test fun `retrieve incorporation filing history using companies house ID`() {
        val filingHistory = companyinfo.getCompanyFilingHistoryFor("02868209", "incorporation")
        log.debug("Filing History: $filingHistory")
        assertThat(filingHistory).isNotNull
    }

    @Test fun `retrieves address filing history using companies house ID`() {
        val filingHistory = companyinfo.getCompanyFilingHistoryFor("02868209", "address")
        log.debug("Filing History: $filingHistory")
        assertThat(filingHistory).isNotNull
    }

    @Test fun `read document metadata from the last filed incorporation information to retrieve the document`() {
        val document = companyinfo.getLatestFiledDocumentForCategory("02868209", "incorporation")
        log.debug(document.toString())
        //document.writeTo("/tmp/02868209-incorporation.pdf")
    }

    @Test fun `read document metadata from the last filed address information to retrieve the document`() {
        val document = companyinfo.getLatestFiledDocumentForCategory("02868209", "address")
        log.debug(document.toString())
        //document.writeTo("/tmp/02868209-address.pdf")
    }

    @Test fun `read a document from companies house`() {
        val document = companyinfo.getDocumentFor("https://document-api.companieshouse.gov.uk/document/lakwoqyUeDVLMpj-Xg6XbD0C318iqLfKE-W0pG3npgY/content")
        assertThat(document.contentLength).isGreaterThan(0)
        log.debug(document.toString())
    }

    private fun loadConfig(): AppConfig {
        return AppConfig(Yaml().load(this.javaClass.classLoader.getResourceAsStream("application.yml")))
    }
}

data class AppConfig(val configData: Map<String, String>) {
    fun get(key: String): String {
        return when (val data = configData[key]) {
            null -> throw IllegalStateException("Could not locate configuration data for key: $key")
            else -> data
        }
    }
}