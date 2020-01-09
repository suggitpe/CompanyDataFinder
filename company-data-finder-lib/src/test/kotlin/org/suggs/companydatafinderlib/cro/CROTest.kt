package org.suggs.companydatafinderlib.cro

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import org.yaml.snakeyaml.Yaml

@DisplayName("CRO Proxy allows us to")
class CROTest {

    private val log = LoggerFactory.getLogger(this::class.java)
    private val config = loadConfig()
    private var cRO = CROProxy(config.get("cro_key"))

    @Test fun `retrieve data using cro ID`() {
        val companyData = cRO.getCompanyDataFor("83740")
        log.debug("CRO Data: $companyData")
        assertThat(companyData).isNotNull
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