package com.example.bingoapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class HeaderFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_header, container, false)
        try {
            val btn1: Button = v.findViewById(R.id.b1)
            val btn2: Button = v.findViewById(R.id.b2)
            val btn3: Button = v.findViewById(R.id.b3)
            val btn4: Button = v.findViewById(R.id.b4)
            val btn5: Button = v.findViewById(R.id.b5)
            val btn6: Button = v.findViewById(R.id.b6)
            val text1: ImageView = v.findViewById(R.id.t1)
            val text2: ImageView = v.findViewById(R.id.t2)
            val text3: ImageView = v.findViewById(R.id.t3)
            val text4: ImageView = v.findViewById(R.id.t4)
            val text5: ImageView = v.findViewById(R.id.t5)
            val text6: ImageView = v.findViewById(R.id.t6)

            btn1.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, MainActivitybus::class.java)
                    it.startActivity(intent)
                }

            }
            btn2.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, MainActivitybus::class.java)
                    it.startActivity(intent)
                }

            }
            btn3.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, MainActivitybus::class.java)
                    it.startActivity(intent)
                }

            }
            btn4.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, MainActivitybus::class.java)
                    it.startActivity(intent)
                }

            }
            btn5.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, MainActivitybus::class.java)
                    it.startActivity(intent)
                }

            }
            btn6.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, MainActivitybus::class.java)
                    it.startActivity(intent)
                }

            }
            text1.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, MainActivitybus::class.java)
                    it.startActivity(intent)
                }

            }
            text2.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, MainActivitybus::class.java)
                    it.startActivity(intent)
                }

            }
            text3.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, MainActivitybus::class.java)
                    it.startActivity(intent)
                }

            }
            text4.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, MainActivitybus::class.java)
                    it.startActivity(intent)
                }

            }
            text5.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, MainActivitybus::class.java)
                    it.startActivity(intent)
                }

            }
            text6.setOnClickListener {
                activity?.let {
                    val intent = Intent(it, MainActivitybus::class.java)
                    it.startActivity(intent)
                }

            }


        } catch (e: Exception) {
            Log.e("HeaderFragmentError", "Error", e)

        }
        return v
    }
}










