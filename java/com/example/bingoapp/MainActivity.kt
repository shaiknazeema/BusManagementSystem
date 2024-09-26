package com.example.bingoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
     lateinit var imageView: ImageView
     lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView=findViewById(R.id.img1)

        imageView.setOnClickListener{
            var i =Intent(this,Online::class.java)
            startActivity(i)
        }
        handler= Handler()
        handler.postDelayed({
            val  intent = Intent(this,Online::class.java)
            startActivity(intent)
            finish()
        },2000)
    }
}