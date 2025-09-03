package org.example.dsl_script.connect.fluent

interface ConnectorBuilder<T> : ConnectModelBuilder{

    fun id(id: String): ConnectorBuilder<T>

    fun type(type: ConnectorType): ConnectorBuilder<T>

    fun connector(): ConnectorBuilder<T>

}