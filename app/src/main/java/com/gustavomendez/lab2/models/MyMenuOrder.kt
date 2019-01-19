package com.gustavomendez.lab2.models

class MyMenuOrder:MenuOrder {
    override val menuOrder: ArrayList<String> = ArrayList()
    var isComplete: Boolean = false

    override fun clear() {
        menuOrder.clear()
    }

    override fun add(element: String) {
        menuOrder.add(element)
    }

    override fun del(elementIndex: Int) {
        menuOrder.removeAt(elementIndex)
    }

    override fun done() {
        isComplete = true
    }


}