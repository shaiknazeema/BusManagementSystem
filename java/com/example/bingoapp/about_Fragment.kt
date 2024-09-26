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


class about_Fragment : Fragment() {


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_about_, container, false)
        try {
            val n11: ImageView = v.findViewById(R.id.n1)
            val n22: ImageView = v.findViewById(R.id.n2)
            val n33: ImageView = v.findViewById(R.id.n3)
            val n44: ImageView = v.findViewById(R.id.n4)
            val t11: TextView = v.findViewById(R.id.t1)
            val t22: TextView = v.findViewById(R.id.t2)
            val t33: TextView = v.findViewById(R.id.t3)
            val t44: TextView = v.findViewById(R.id.t4)

            n11.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, MainActivitylist::class.java)
                    it.startActivity(intent)
                }

            }
            n22.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, MainActivitylist::class.java)
                    it.startActivity(intent)
                }

            }
            n33.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, con::class.java)
                    it.startActivity(intent)
                }

            }
            n44.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, MainActivitylist::class.java)
                    it.startActivity(intent)
                }

            }
            t11.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, MainActivitylist::class.java)
                    it.startActivity(intent)
                }

            }
            t22.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, MainActivitylist::class.java)
                    it.startActivity(intent)
                }

            }
            t33.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, con::class.java)
                    it.startActivity(intent)
                }

            }
            t44.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, MainActivitylist::class.java)
                    it.startActivity(intent)
                }

            }

        } catch (e: Exception) {
            Log.e("HeaderFragmentError", "Error", e)

        }
        return v

    }
}




