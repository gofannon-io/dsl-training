package org.example.dsl_script.connect.fluent

import org.example.dsl_script.connect.fluent.ConnectorsBuilder

interface PlaneBuilder {

    fun id(id : String) : PlaneBuilder
    fun name(name: String) : PlaneBuilder

    fun connectors() : ConnectorsBuilder<PlaneBuilder>

    fun end() : ConnectModelBuilder
}
