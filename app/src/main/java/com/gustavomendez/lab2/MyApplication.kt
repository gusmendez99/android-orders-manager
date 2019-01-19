package com.gustavomendez.lab2

import android.app.Application
import com.gustavomendez.lab2.models.MenuOrder
import com.gustavomendez.lab2.models.MyMenuOrder


class MyApplication : Application() {

    companion object {
        lateinit var dummyProducts: List<String>
        lateinit var myMenuOrder: MenuOrder
    }

    override fun onCreate() {
        super.onCreate()
        dummyProducts = listOf("Hamburguesa", "Tacos", "Pepsi", "Papas fritas", "Tamalitos") //Dummy products added
        myMenuOrder = MyMenuOrder() //Init of the implementation of MenuOrder
    }


}