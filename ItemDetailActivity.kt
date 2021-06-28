package com.example.aboutnamdinh

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ItemDetailActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_item)

        val img_detail :ImageView = findViewById(R.id.img_detail_item)
        val txt_des_detail:TextView = findViewById(R.id.txt_description_detail)

        txt_des_detail.text = intent.getStringExtra("key_des")
        intent.getStringExtra("key_img")?.let{
            img_detail.setImageResource(it.toInt())
        }
    }
}