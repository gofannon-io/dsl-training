package org.example.dsl_script.connect.fluent

interface ConnectionBuilder : ConnectModelBuilder {

    fun from(equipmentId: String, portId: String): ConnectionBuilder
    fun to(equipmentId: String, portId: String): ConnectionBuilder
    fun with(cableId: String): ConnectionBuilder

}
