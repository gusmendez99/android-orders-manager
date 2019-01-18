package com.gustavomendez.lab2.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.gustavomendez.lab2.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_show_menu.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
        }

        btn_show_order.setOnClickListener {
            startActivity(Intent(this, OrderActivity::class.java))
        }

    }





}
