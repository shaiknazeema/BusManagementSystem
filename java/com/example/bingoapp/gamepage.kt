package com.example.bingoapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class gamepage : AppCompatActivity() {
    lateinit var text1: EditText
    lateinit var text2: EditText
    lateinit var text3: EditText
    lateinit var text4: EditText
    lateinit var btn: Button
    private lateinit var binding:gamepage
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var firebaseDatabase: FirebaseDatabase
    lateinit var list:List<StudentModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gamepage)
        text1 = findViewById(R.id.t1)
        text2 = findViewById(R.id.t2)
        text3 = findViewById(R.id.t3)
        text4 = findViewById(R.id.t4)
        btn = findViewById(R.id.b1)

         firebaseDatabase = FirebaseDatabase.getInstance()
        list =ArrayList()


        btn.setOnClickListener {
            val email = text1.text.toString().trim()
            val password = text2.text.toString().trim()
            val confirmPassword = text3.text.toString().trim()
            val phoneNumber = text4.text.toString().trim()

            // Email Validation
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                text1.error = "Enter a valid email"
                text1.requestFocus()
                return@setOnClickListener
            }


            if (password.isEmpty()) {
                text2.error = "Please enter your password"
                text2.requestFocus()
                return@setOnClickListener
            } else if (password.length < 6) {
                text2.error = "Password must be at least 6 characters"
                text2.requestFocus()
                return@setOnClickListener
            }

            // Confirm Password Validation
            if (password != confirmPassword) {
                text3.error = "Passwords do not match"
                text3.requestFocus()
                return@setOnClickListener
            }

            // Phone Number Validation (must be 10 digits)
            if (phoneNumber.length != 10 || !phoneNumber.matches("\\d{10}".toRegex())) {
                text4.error = "Enter a valid 10-digit phone number"
                text4.requestFocus()
                return@setOnClickListener
            }
            val student =StudentModel(Uname = text1.text.toString(), Password = text2.text.toString())
            firebaseDatabase.reference.child("Login").push().setValue(student).addOnCompleteListener{task ->
                if (task.isSuccessful){
                    text1.text.clear()
                    text2.text.clear()
                    text3.text.clear()
                    text4.text.clear()
                }
            }
            val i =Intent(this,Online::class.java)
            startActivity(i)
        }
    }
}
