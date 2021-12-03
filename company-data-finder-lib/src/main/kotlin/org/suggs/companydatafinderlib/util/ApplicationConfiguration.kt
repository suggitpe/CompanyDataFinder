package org.suggs.companydatafinderlib.util

import org.yaml.snakeyaml.Yaml

/**
 * Super simple encapsulation of a yaml config file with null safe get operation
 */
data class ApplicationConfiguration(val configurationFile: String) {

    private val configData: Map<String, String> = Yaml().load(this.javaClass.classLoader.getResourceAsStream(configurationFile))

    fun get(key: String): String {
        return when (val data = configData[key]) {
            null -> throw IllegalStateException("Could not locate configuration data for key: $key")
            else -> data
        }
    }
}