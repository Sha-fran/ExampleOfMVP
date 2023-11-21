package com.example.myexperiments

object ModelImpl:Model {
    private var items = mutableListOf<String>()

    override fun getItem(): List<String> {
        return items
    }

    override fun addItem() {
        items.add("Item ${items.size + 1}")
    }
}
