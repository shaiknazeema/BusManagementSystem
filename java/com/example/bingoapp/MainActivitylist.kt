package com.example.bingoapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.ImageView
import android.widget.TextView

class MainActivitylist : AppCompatActivity() {
    lateinit var img1:ImageView
    lateinit var img2:ImageView
    lateinit var img3:ImageView
    lateinit var img4:ImageView
    lateinit var img5:ImageView
    lateinit var img6:ImageView
    lateinit var img7:ImageView
    lateinit var img8:ImageView
    lateinit var img9:ImageView
    lateinit var img10:ImageView
    lateinit var img11:ImageView
    lateinit var text1:TextView
    lateinit var text2:TextView
    lateinit var text3:TextView
    lateinit var text4:TextView
    lateinit var text5:TextView
    lateinit var text6:TextView
    lateinit var text7:TextView
    lateinit var text8:TextView
    lateinit var text9:TextView
    lateinit var text10:TextView
    lateinit var text11:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activitylist)

        text1=findViewById(R.id.c1)
        text1.setOnClickListener{
            var i = Intent(this,frompage::class.java)
            startActivity(i)
        }
        text2=findViewById(R.id.c2)
        text2.setOnClickListener{
            var i = Intent(this,frompage::class.java)
            startActivity(i)
        }
        text3=findViewById(R.id.c3)
        text3.setOnClickListener{
            var i = Intent(this,frompage::class.java)
            startActivity(i)
        }
        text4=findViewById(R.id.c4)
        text4.setOnClickListener{
            var i = Intent(this,frompage::class.java)
            startActivity(i)
        }
        text5=findViewById(R.id.c5)
        text5.setOnClickListener{
            var i = Intent(this,frompage::class.java)
            startActivity(i)
        }
        text6=findViewById(R.id.c6)
        text6.setOnClickListener{
            var i = Intent(this,frompage::class.java)
            startActivity(i)
        }
        text7=findViewById(R.id.c7)
        text7.setOnClickListener{
            var i = Intent(this,frompage::class.java)
            startActivity(i)
        }
        text8=findViewById(R.id.c8)
        text8.setOnClickListener{
            var i = Intent(this,frompage::class.java)
            startActivity(i)
        }
        text9=findViewById(R.id.c9)
        text9.setOnClickListener{
            var i = Intent(this,frompage::class.java)
            startActivity(i)
        }
        text10=findViewById(R.id.c10)
        text10.setOnClickListener{
            var i = Intent(this,frompage::class.java)
            startActivity(i)
        }
        text11=findViewById(R.id.c11)
        text11.setOnClickListener{
            var i = Intent(this,frompage::class.java)
            startActivity(i)
        }
        img1=findViewById(R.id.i1)
        img1.setOnClickListener{
            var i = Intent(this,frompage::class.java)
            startActivity(i)
        }

        img2=findViewById(R.id.i2)
        img2.setOnClickListener{
            var i = Intent(this,frompage::class.java)
            startActivity(i)
        }
        img3=findViewById(R.id.i3)
        img3.setOnClickListener{
            var i = Intent(this,frompage::class.java)
            startActivity(i)
        }
        img4=findViewById(R.id.i4)
        img4.setOnClickListener{
            var i = Intent(this,frompage::class.java)
            startActivity(i)
        }
        img5=findViewById(R.id.i5)
        img5.setOnClickListener{
            var i = Intent(this,frompage::class.java)
            startActivity(i)
        }
        img6=findViewById(R.id.i6)
        img6.setOnClickListener{
            var i = Intent(this,frompage::class.java)
            startActivity(i)
        }
        img7=findViewById(R.id.i7)
        img7.setOnClickListener{
            var i = Intent(this,frompage::class.java)
            startActivity(i)
        }
        img8=findViewById(R.id.i8)
        img8.setOnClickListener{
            var i = Intent(this,frompage::class.java)
            startActivity(i)
        }
        img9=findViewById(R.id.i9)
        img9.setOnClickListener{
            var i = Intent(this,frompage::class.java)
            startActivity(i)
        }
        img10=findViewById(R.id.i10)
        img10.setOnClickListener{
            var i = Intent(this,frompage::class.java)
            startActivity(i)
        }
        img11=findViewById(R.id.i11)
        img11.setOnClickListener{
            var i = Intent(this,frompage::class.java)
            startActivity(i)
        }

    }

}
