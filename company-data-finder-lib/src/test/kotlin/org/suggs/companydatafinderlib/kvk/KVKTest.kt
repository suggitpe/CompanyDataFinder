package org.suggs.companydatafinderlib.kvk

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import org.yaml.snakeyaml.Yaml

@DisplayName("KVK Proxy allows us to")
class KVKTest {

    private val log = LoggerFactory.getLogger(this::class.java)
    private val config = loadConfig()
    private var kVK = KVKProxy(config.get("user"), config.get("pass"))

    @Test fun `retrieve data using kvk ID`() {
        val companyData = kVK.getCompanyDataFor("69599084")
        log.debug("KVK Data: $companyData")
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