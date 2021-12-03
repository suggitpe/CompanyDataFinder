package org.suggs.companydatafinderlib.bundesanzeiger.domain

import com.fasterxml.jackson.annotation.JsonProperty

data class BunsesanzeigerCompanyProfile(@JsonProperty("company_number") val companyNumber: String)
