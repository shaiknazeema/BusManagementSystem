package com.example.bingoapp

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Paym : AppCompatActivity() {
    private lateinit var etAmount: EditText
    private lateinit var etName: EditText
    private lateinit var etPhoneNumber: EditText
    private lateinit var etSeats: EditText
    private lateinit var rgPaymentMethods: RadioGroup
    private lateinit var btnPay: Button

    private val GOOGLE_PAY_PACKAGE_NAME = "com.google.android.apps.nbu.paisa.user"
    private val PHONEPE_PACKAGE_NAME = "com.phonepe.app"

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paym)

        etAmount = findViewById(R.id.et_amount)
        etName = findViewById(R.id.et_name)
        etPhoneNumber = findViewById(R.id.et_phone_number)
        etSeats = findViewById(R.id.et_seats)
        rgPaymentMethods = findViewById(R.id.rg_payment_methods)
        btnPay = findViewById(R.id.btn_pay)

        btnPay.setOnClickListener {
            val amount = etAmount.text.toString().trim()
            val name = etName.text.toString().trim()
            val phoneNumber = etPhoneNumber.text.toString().trim()
            val seats = etSeats.text.toString().trim()

            if (amount.isEmpty()) {
                etAmount.error = "Please enter amount"
                return@setOnClickListener
            }

            if (name.isEmpty()) {
                etName.error = "Please enter your name"
                return@setOnClickListener
            }

            if (phoneNumber.isEmpty()) {
                etPhoneNumber.error = "Please enter your phone number"
                return@setOnClickListener
            }

            if (seats.isEmpty()) {
                etSeats.error = "Please enter the number of seats"
                return@setOnClickListener
            }
            var i =Intent(this,thank::class.java)
            startActivity(i)

            // Handle UPI Payment initiation based on selected method
            when (rgPaymentMethods.checkedRadioButtonId) {
                R.id.rb_google_pay -> initiateUPIPayment(amount, GOOGLE_PAY_PACKAGE_NAME, name)
                R.id.rb_phone_pe -> initiateUPIPayment(amount, PHONEPE_PACKAGE_NAME, name)
                R.id.rb_cod -> {
                    Toast.makeText(this, "Cash on Delivery Selected", Toast.LENGTH_SHORT).show()
                    saveCODOrder(amount)
                }
                else -> Toast.makeText(this, "Please select a payment method", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Function to initiate UPI payment via Google Pay or PhonePe explicitly
    private fun initiateUPIPayment(amount: String, packageName: String, name: String) {
        val upiId = "9642124039" // The UPI ID to which the payment is made

        // Create the UPI URI
        val uri = Uri.parse("upi://pay").buildUpon()
            .appendQueryParameter("pa", upiId)   // Payee UPI ID
            .appendQueryParameter("pn", name)    // Payee Name
            .appendQueryParameter("tn", "Payment for $name (Seats: ${etSeats.text})") // Transaction note
            .appendQueryParameter("am", amount)  // Amount to pay
            .appendQueryParameter("cu", "INR")   // Currency
            .build()

        // Create the intent and set the specific package (Google Pay or PhonePe)
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = uri
            setPackage(packageName) // Explicitly set the package to Google Pay or PhonePe
        }

        // Start the UPI payment activity for the specific app
        try {
            startActivity(intent)
        } catch (e: Exception) {
            Toast.makeText(this, "Unable to open the payment app", Toast.LENGTH_SHORT).show()
        }
    }

    // Handle Cash on Delivery logic
    private fun saveCODOrder(amount: String) {
        // Logic to save Cash on Delivery (COD) order
        Toast.makeText(this, "COD Order placed for Rs. $amount", Toast.LENGTH_SHORT).show()
    }
}
