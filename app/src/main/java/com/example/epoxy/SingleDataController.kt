package com.example.epoxy

import com.airbnb.epoxy.EpoxyController

class SingleDataController : EpoxyController() {
    var data: List<DataModel>

    init {
        data = listOf(
            DataModel(1,"abc", "rafim"),
            DataModel(2,"ab", "rafim"),
            DataModel(3,"abcd", "rafim"),
            DataModel(4,"a", "rafim"),
            DataModel(5,"abcde", "rafim")
        )
    }

    override fun buildModels() {
        var i: Long = 0
        data.forEach {
            SingleData_().id(it.id).name(it.name).title(it.title).addTo(this)
        }
    }
}