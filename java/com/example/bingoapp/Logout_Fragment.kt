package com.example.bingoapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase


class Logout_Fragment : Fragment() {
    lateinit var text1: EditText
    lateinit var text2: EditText
    lateinit var text3: EditText
    lateinit var text4: EditText
    lateinit var btn: Button
    private lateinit var binding:gamepage
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var firebaseDatabase: FirebaseDatabase
    lateinit var list:List<StudentModel>

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_logout_, container, false)


        text1 = v.findViewById(R.id.t1)
        text2 = v.findViewById(R.id.t2)
        text3 = v.findViewById(R.id.t3)
        text4 = v.findViewById(R.id.t4)
        btn = v.findViewById(R.id.b1)

        firebaseDatabase = FirebaseDatabase.getInstance()
        list =ArrayList()


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

            val i = Intent(this,Online::class.java)
            startActivity(i)
        }



        return v
    }

    private fun Intent(logoutFragment: Logout_Fragment, java: Class<Online>): Intent? {
        return null
    }


}