package org.example.dsl_script.connect.fluent

interface CableBuilder : ConnectModelBuilder{

    fun id(id: String): CableBuilder

    fun type(type: ConnectorType): CableBuilder

}
