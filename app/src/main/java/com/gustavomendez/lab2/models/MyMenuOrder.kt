package com.gustavomendez.lab2.models

class MyMenuOrder:MenuOrder {
    override val menuOrder: ArrayList<String> = ArrayList()

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
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}