package com.example.bingoapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivitybus : AppCompatActivity() {
    lateinit var text1:TextView
    lateinit var text2:TextView
    lateinit var text3:TextView
    lateinit var text4:TextView
    lateinit var img1:ImageView
    lateinit var img2:ImageView
    lateinit var img3:ImageView
    lateinit var img4:ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activitybus)
        text1=findViewById(R.id.t1)
        text1.setOnClickListener{
            var i = Intent(this,MainActivitylist::class.java)
            startActivity(i)
        }
        text2=findViewById(R.id.t2)
        text2.setOnClickListener{
            var i = Intent(this,MainActivitylist::class.java)
            startActivity(i)
        }
        text3=findViewById(R.id.t3)
        text3.setOnClickListener{
            var i = Intent(this,con::class.java)
            startActivity(i)
        }
        text4=findViewById(R.id.t4)
        text4.setOnClickListener{
            var i = Intent(this,MainActivitylist::class.java)
            startActivity(i)
        }
        img1=findViewById(R.id.n1)
        img1.setOnClickListener{
            var i = Intent(this,MainActivitylist::class.java)
            startActivity(i)
        }
        img2=findViewById(R.id.n2)
        img2.setOnClickListener{
            var i = Intent(this,MainActivitylist::class.java)
            startActivity(i)
        }
        img3=findViewById(R.id.n3)
        img3.setOnClickListener{
            var i = Intent(this,con::class.java)
            startActivity(i)
        }
        img4=findViewById(R.id.n4)
        img4.setOnClickListener{
            var i = Intent(this,MainActivitylist::class.java)
            startActivity(i)
        }

    }
}