package com.example.bingoapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class con : AppCompatActivity() {
    lateinit var c111:TextView
    lateinit var c22:TextView
    lateinit var c33:TextView
    lateinit var c44:TextView
    lateinit var c55:TextView
    lateinit var c66:TextView
    lateinit var c77:TextView
    lateinit var c88:TextView
    lateinit var c99:TextView
    lateinit var c100:TextView
    lateinit var c1111:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_con)

        c111=findViewById(R.id.c1)
        c22=findViewById(R.id.c2)
        c33=findViewById(R.id.c3)
        c44=findViewById(R.id.c4)
        c55=findViewById(R.id.c5)
        c66=findViewById(R.id.c6)
        c77=findViewById(R.id.c7)
        c88=findViewById(R.id.c8)
        c99=findViewById(R.id.c9)
        c100=findViewById(R.id.c10)
        c1111=findViewById(R.id.c11)


        val phoneNumber = "9381965746"

        c111.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL)
            i.data = Uri.parse("tel:$phoneNumber")
            startActivity(i)
        }
        c22.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL)
            i.data = Uri.parse("tel:$phoneNumber")
            startActivity(i)
        }
        c33.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL)
            i.data = Uri.parse("tel:$phoneNumber")
            startActivity(i)
        }
        c44.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL)
            i.data = Uri.parse("tel:$phoneNumber")
            startActivity(i)
        }
        c55.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL)
            i.data = Uri.parse("tel:$phoneNumber")
            startActivity(i)
        }
        c66.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL)
            i.data = Uri.parse("tel:$phoneNumber")
            startActivity(i)
        }
        c77.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL)
            i.data = Uri.parse("tel:$phoneNumber")
            startActivity(i)
        }
        c88.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL)
            i.data = Uri.parse("tel:$phoneNumber")
            startActivity(i)
        }
        c99.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL)
            i.data = Uri.parse("tel:$phoneNumber")
            startActivity(i)
        }
        c100.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL)
            i.data = Uri.parse("tel:$phoneNumber")
            startActivity(i)
        }
        c1111.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL)
            i.data = Uri.parse("tel:$phoneNumber")
            startActivity(i)
        }


    }
}