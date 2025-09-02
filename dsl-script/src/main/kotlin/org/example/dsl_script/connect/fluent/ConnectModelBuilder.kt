package org.example.dsl_script.connect.fluent


interface ConnectModelBuilder {

    fun plane() : PlaneBuilder

    fun equipment() : EquipmentBuilder

    fun cable() : CableBuilder

    fun connect() : ConnectionBuilder

    fun build(): ConnectModel
}