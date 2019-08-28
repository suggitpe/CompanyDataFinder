package org.suggs.companydatafinder

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class CompanyDataFinderApp

fun main(args: Array<String>) {
    runApplication<CompanyDataFinderApp>(*args)
}