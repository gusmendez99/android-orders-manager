package com.gustavomendez.lab2.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.gustavomendez.lab2.MyApplication
import com.gustavomendez.lab2.R
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        //Simple ArrayAdapter with a layout with simple string. Elements comes from MyApplication
        val adapterProducts = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, MyApplication.dummyProducts)
        list_view_products.adapter =  adapterProducts

        list_view_products.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            // Get the selected item text from ListView
            val selectedItem = parent.getItemAtPosition(position) as String
            MyApplication.myMenuOrder.add(selectedItem) //Add the current item to the global order list
            // Display the selected item text on Toast
            Toast.makeText(this, "Se agregó $selectedItem", Toast.LENGTH_LONG).show()
        }

        btn_home.setOnClickListener {
            this.finish() //Finish current activity
        }

    }
}
