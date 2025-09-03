package org.example.dsl_script.connect.fluent

import org.example.dsl_script.connect.fluent.EquipmentNature

interface EquipmentBuilder {

    fun nature(nature : EquipmentNature) : EquipmentBuilder

    fun id(id : String) : EquipmentBuilder

    fun type(type : EquipmentType) : EquipmentBuilder

    fun connectors() : ConnectorsBuilder<EquipmentBuilder>

}
