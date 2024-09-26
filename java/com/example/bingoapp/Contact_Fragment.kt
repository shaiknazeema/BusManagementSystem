package com.example.bingoapp

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


@Suppress("UNREACHABLE_CODE")
class Contact_Fragment : Fragment() {


    @SuppressLint("SuspiciousIndentation")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
      val v = inflater.inflate(R.layout.fragment_contact_, container, false)
        try {
            var c111:TextView=v.findViewById(R.id.c1)
            var c22:TextView=v.findViewById(R.id.c2)
            var c33:TextView=v.findViewById(R.id.c3)
            var c44:TextView=v.findViewById(R.id.c4)
            var c55:TextView=v.findViewById(R.id.c5)
            var c66:TextView=v.findViewById(R.id.c6)
            var c77:TextView=v.findViewById(R.id.c7)
            var c88:TextView=v.findViewById(R.id.c8)
            var c99:TextView=v.findViewById(R.id.c9)
            var c100:TextView=v.findViewById(R.id.c10)
            var c1111:TextView=v.findViewById(R.id.c11)

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

        } catch (e: Exception) {
            Log.e("ContactFragmentError", "Error", e)
        }
        return v
    }
}
