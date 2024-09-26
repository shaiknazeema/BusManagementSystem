package com.example.bingoapp

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.GridLayout
import android.widget.TextView
import com.google.firebase.FirebaseApp
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class seats : AppCompatActivity() {

    private lateinit var database: DatabaseReference
    private val selectedSeats = mutableListOf<String>()
    private var totalSeatsAvailable = 24
    private lateinit var tvSeatsAvailable: TextView
    private lateinit var seatGrid: GridLayout

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seats)


        FirebaseApp.initializeApp(this)


        // Initialize Firebase database reference
        database = FirebaseDatabase.getInstance().getReference("seats")

        tvSeatsAvailable = findViewById(R.id.tvSeatsAvailable)
        seatGrid = findViewById(R.id.seatGrid)

        // Set initial text for available seats
        tvSeatsAvailable.text = "$totalSeatsAvailable seats available"

        // Load seat data from Firebase and update UI accordingly
        loadSeatData()

        // Handle seat selection
        for (i in 0 until seatGrid.childCount) {
            val seatButton = seatGrid.getChildAt(i) as Button
            seatButton.setOnClickListener { handleSeatSelection(it as Button) }
        }

        // Confirm button to submit selected seats to Firebase
        val btnSubmit: Button = findViewById(R.id.btnSubmit)
        btnSubmit.setOnClickListener {
            confirmBooking()
            var i =Intent(this,Paym::class.java)
            startActivity(i)
        }
    }

    // Load seat data from Firebase
    private fun loadSeatData() {
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                for (seatSnapshot in snapshot.children) {
                    val seatId = seatSnapshot.key // A1, A2, B1, etc.
                    val status = seatSnapshot.getValue(String::class.java)

                    val seatButton: Button? = findViewById(
                        resources.getIdentifier("seat$seatId", "id", packageName)
                    )
                    // Update seat availability based on the database value
                    if (status == "booked") {
                        seatButton?.isEnabled = false
                        seatButton?.setBackgroundColor(Color.GRAY)
                        totalSeatsAvailable--
                    }
                }
                tvSeatsAvailable.text = "$totalSeatsAvailable seats available"
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle database error
            }
        })
    }

    // Handle seat selection
    private fun handleSeatSelection(button: Button) {
        val seatId = button.text.toString()
        if (selectedSeats.contains(seatId)) {
            selectedSeats.remove(seatId)
            button.setBackgroundColor(Color.BLACK)  // Deselect seat
        } else {
            selectedSeats.add(seatId)
            button.setBackgroundColor(Color.GREEN)  // Select seat
        }
    }

    // Confirm booking: update selected seats as "booked" in Firebase
    private fun confirmBooking() {
        val updates = HashMap<String, Any>()
        for (seat in selectedSeats) {
            updates[seat] = "booked"
        }

        database.updateChildren(updates).addOnCompleteListener { task ->
            if (task.isSuccessful) {
                // Successfully booked seats
                for (seat in selectedSeats) {
                    val seatButton: Button? = findViewById(
                        resources.getIdentifier("seat$seat", "id", packageName)
                    )
                    seatButton?.isEnabled = false
                    seatButton?.setBackgroundColor(Color.GRAY)  // Mark as booked
                }
                totalSeatsAvailable -= selectedSeats.size
                tvSeatsAvailable.text = "$totalSeatsAvailable seats available"
                selectedSeats.clear()  // Clear selected seats list after confirmation
            } else {
                // Handle booking error
            }

        }


    }
}