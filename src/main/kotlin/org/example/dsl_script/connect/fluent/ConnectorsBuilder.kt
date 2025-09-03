package org.example.dsl_script.connect.fluent

interface ConnectorsBuilder<T> {

    fun connector() : ConnectorBuilder<T>


    fun end() : ConnectModelBuilder

}