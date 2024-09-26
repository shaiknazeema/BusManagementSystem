package com.example.bingoapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.*

class Online : AppCompatActivity() {
    lateinit var text1: EditText // Email
    lateinit var text2: EditText // Password
    lateinit var cb: CheckBox // Checkbox
    lateinit var btn: Button // Login button
    lateinit var btn1: Button // Navigate to gamepage button
    lateinit var database: DatabaseReference

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_online)

        text1 = findViewById(R.id.t1) // Email input
        text2 = findViewById(R.id.t2) // Password input
        cb = findViewById(R.id.ch) // Checkbox input
        btn = findViewById(R.id.b3) // Login button
        btn1 = findViewById(R.id.b1) // Navigate to gamepage button
        database = FirebaseDatabase.getInstance().getReference("Login")

        btn.setOnClickListener {
            var email = text1.text.toString().trim().lowercase() // Trim and lowercase email
            var pass = text2.text.toString().trim() // Trim password

            // Email Validation
            if (email.isEmpty()) {
                text1.error = "Please enter your email"
                text1.requestFocus()
                return@setOnClickListener
            } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                text1.error = "Please enter a valid email"
                text1.requestFocus()
                return@setOnClickListener
            }

            // Password Validation
            if (pass.isEmpty()) {
                text2.error = "Please enter your password"
                text2.requestFocus()
                return@setOnClickListener
            } else if (pass.length < 6) {
                text2.error = "Password must be at least 6 characters"
                text2.requestFocus()
                return@setOnClickListener
            }

            // Checkbox Validation
            if (!cb.isChecked) {
                Toast.makeText(this, "Please agree to the terms by checking the box", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Log.d("DEBUG", "Attempting login with email: $email and password: $pass")

            // Retrieve user data from Firebase
            database.orderByChild("uname").equalTo(email).addListenerForSingleValueEvent(object : ValueEventListener {
                override fun onDataChange(snapshot: DataSnapshot) {
                    if (snapshot.exists()) {
                        Log.d("DEBUG", "User with email $email found in Firebase")
                        for (userSnapshot in snapshot.children) {
                            val storedEmail = userSnapshot.child("uname").value.toString().trim().lowercase()
                            val storedPassword = userSnapshot.child("password").value.toString().trim()

                            Log.d("DEBUG", "Stored Email: $storedEmail")
                            Log.d("DEBUG", "Stored Password: $storedPassword")

                            // Compare the stored email and password with entered values
                            if (storedEmail == email && storedPassword == pass) {
                                // If both email and password match, proceed to the next activity
                                Toast.makeText(this@Online, "Login Successful", Toast.LENGTH_SHORT).show()
                                val intent = Intent(this@Online, MainActivity2::class.java)
                                startActivity(intent)
                                finish()
                            } else {
                                Toast.makeText(this@Online, "Incorrect email or password", Toast.LENGTH_SHORT).show()
                                Log.d("DEBUG", "Email or Password mismatch: Entered Email - $email, Stored Email - $storedEmail, Entered Password - $pass, Stored Password - $storedPassword")
                            }
                        }
                    } else {
                        Toast.makeText(this@Online, "No account found with this email", Toast.LENGTH_SHORT).show()
                        Log.d("DEBUG", "No account found for email: $email")
                    }
                }

                override fun onCancelled(error: DatabaseError) {
                    Log.e("DEBUG", "Database error: ${error.message}")
                    Toast.makeText(this@Online, "Database error: ${error.message}", Toast.LENGTH_SHORT).show()
                }
            })
        }

        // Navigate to the gamepage activity
        btn1.setOnClickListener {
            val intent = Intent(this, gamepage::class.java)
            startActivity(intent)
        }
    }
}
