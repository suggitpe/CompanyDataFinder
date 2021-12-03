package org.suggs.companydatafinderlib.bundesanzeiger

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import org.suggs.companydatafinderlib.util.ApplicationConfiguration

class BundesanzeigerProxyTest {

    private val log = LoggerFactory.getLogger(this::class.java)
    private val config = ApplicationConfiguration("bundesanzeiger-cfg.yml")
    private var bundesanzeiger = BundesanzeigerProxy(config.get("auth"))

    @Test fun `retrieve data using companies house ID`() {
        val companyData = bundesanzeiger.getCompanyDataFor("HRB107648")
        log.debug("Bundesanzeiger Data: $companyData")
        Assertions.assertThat(companyData).isNotNull
    }

}

