package com.gustavomendez.lab2.activities

import android.opengl.Visibility
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.gustavomendez.lab2.MyApplication
import com.gustavomendez.lab2.R
import kotlinx.android.synthetic.main.activity_order.*

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val adapterOrders = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, MyApplication.myMenuOrder.menuOrder)
        list_view_order.adapter =  adapterOrders

        list_view_order.onItemLongClickListener = AdapterView.OnItemLongClickListener { parent, view, position, id ->
            // Get the selected item text from ListView
            val selectedItem = parent.getItemAtPosition(position) as String
            MyApplication.myMenuOrder.del(position)
            // Display the selected item text on TextView
            Toast.makeText(this, "Se elimino $selectedItem", Toast.LENGTH_LONG).show()
            adapterOrders.notifyDataSetChanged()

            if(parent.count == 0) {toggleImageVisibility()}

            return@OnItemLongClickListener true

        }

        btn_clear_order.setOnClickListener {
            MyApplication.myMenuOrder.clear()
            adapterOrders.notifyDataSetChanged()
            Toast.makeText(this, "Has limpiado tu lista...", Toast.LENGTH_LONG).show()
            toggleImageVisibility()
        }

        btn_set_order.setOnClickListener {
            MyApplication.myMenuOrder.clear()
            adapterOrders.notifyDataSetChanged()
            img_cart.setImageResource(R.drawable.check)
            toggleImageVisibility()
            Toast.makeText(this, "Tu pedido se ha procesado con exito!", Toast.LENGTH_LONG).show()
        }

        btn_home.setOnClickListener {
            this.finish()
        }

    }

    fun toggleImageVisibility(){
        if(img_cart.visibility == View.GONE){
            img_cart.visibility = View.VISIBLE
            list_view_order.visibility = View.GONE
        } else {
            img_cart.visibility = View.GONE
            list_view_order.visibility = View.VISIBLE
        }
    }
}
