package com.example.bingoapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class Buses_Fragment : Fragment() {


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v= inflater.inflate(R.layout.fragment_buses_, container, false)
        try {
            val i111:ImageView=v.findViewById(R.id.i1)
            val i22:ImageView=v.findViewById(R.id.i2)
            val i33:ImageView=v.findViewById(R.id.i3)
            val i44:ImageView=v.findViewById(R.id.i4)
            val i55:ImageView=v.findViewById(R.id.i5)
            val i66:ImageView=v.findViewById(R.id.i6)
            val i77:ImageView=v.findViewById(R.id.i7)
            val i88:ImageView=v.findViewById(R.id.i8)
            val i99:ImageView=v.findViewById(R.id.i9)
            val i100:ImageView=v.findViewById(R.id.i10)
            val i1111:ImageView=v.findViewById(R.id.i11)
            val c11:TextView=v.findViewById(R.id.c1)
            val c22:TextView=v.findViewById(R.id.c2)
            val c33:TextView=v.findViewById(R.id.c3)
            val c44:TextView=v.findViewById(R.id.c4)
            val c55:TextView=v.findViewById(R.id.c5)
            val c66:TextView=v.findViewById(R.id.c6)
            val c77:TextView=v.findViewById(R.id.c7)
            val c88:TextView=v.findViewById(R.id.c8)
            val c99:TextView=v.findViewById(R.id.c9)
            val c100:TextView=v.findViewById(R.id.c10)
            val c111:TextView=v.findViewById(R.id.c11)


            i111.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, frompage::class.java)
                    it.startActivity(intent)
                }
            }
            i22.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, frompage::class.java)
                    it.startActivity(intent)
                }
            }
            i33.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, frompage::class.java)
                    it.startActivity(intent)
                }
            }
            i44.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, frompage::class.java)
                    it.startActivity(intent)
                }
            }
            i55.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, frompage::class.java)
                    it.startActivity(intent)
                }
            }
            i66.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, frompage::class.java)
                    it.startActivity(intent)
                }
            }
            i77.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, frompage::class.java)
                    it.startActivity(intent)
                }
            }
            i88.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, frompage::class.java)
                    it.startActivity(intent)
                }
            }
            i99.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, frompage::class.java)
                    it.startActivity(intent)
                }
            }
            i100.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, frompage::class.java)
                    it.startActivity(intent)
                }
            }
            i1111.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, frompage::class.java)
                    it.startActivity(intent)
                }
            }
            c11.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, frompage::class.java)
                    it.startActivity(intent)
                }
            }
            c22.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, frompage::class.java)
                    it.startActivity(intent)
                }
            }
            c33.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, frompage::class.java)
                    it.startActivity(intent)
                }
            }
            c44.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, frompage::class.java)
                    it.startActivity(intent)
                }
            }
            c55.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, frompage::class.java)
                    it.startActivity(intent)
                }
            }
            c66.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, frompage::class.java)
                    it.startActivity(intent)
                }
            }
            c77.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, frompage::class.java)
                    it.startActivity(intent)
                }
            }
            c88.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, frompage::class.java)
                    it.startActivity(intent)
                }
            }
            c99.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, frompage::class.java)
                    it.startActivity(intent)
                }
            }
            c100.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, frompage::class.java)
                    it.startActivity(intent)
                }
            }
            c111.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, frompage::class.java)
                    it.startActivity(intent)
                }
            }

        }catch (e: Exception) {
            Log.e("HeaderFragmentError", "Error", e)

        }
        return v
    }
}