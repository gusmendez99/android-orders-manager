package com.gustavomendez.lab2.models

interface MenuOrder {

    val menuOrder: ArrayList<String> // Pedido

    fun clear() // Clear order
    fun add(element: String) // Add element to arraylist
    fun del(elementIndex: Int) // Delete element by index
    fun done() // Complete the order

}