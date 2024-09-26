package com.example.bingoapp

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class frompage : AppCompatActivity() {
    lateinit var button: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frompage)
        button=findViewById(R.id.button)
        button.setOnClickListener{
            var i = Intent(this,seats::class.java)
            startActivity(i)
        }


        val date = findViewById<TextView>(R.id.dateTxt)
        val btn1 =findViewById<Button>(R.id.btn1)
        val cal = Calendar.getInstance()
        val dateSetListener = DatePickerDialog.OnDateSetListener { _, year,monthOfYear, dateOfMonth ->
            cal.set(Calendar.YEAR,year)
            cal.set(Calendar.MONTH,monthOfYear)
            cal.set(Calendar.DAY_OF_MONTH,dateOfMonth)
            dateFormat(cal.time)
        }
        btn1.setOnClickListener{
            DatePickerDialog(
                this,
                dateSetListener,
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH),
                cal.get(Calendar.DAY_OF_MONTH),
            ).show()
        }




        val items = listOf("Viganagaram","Vizag","EastGodavari","WestGodavari","Krishna","Guntur","Prakasam","Nellore","Kadapa","Anantapur")

        val autoComplete : AutoCompleteTextView = findViewById(R.id.a1)

        val  adapter = ArrayAdapter(this,R.layout.data_list,items)

        autoComplete.setAdapter(adapter)

        autoComplete.onItemClickListener = AdapterView.OnItemClickListener{
            adapter,view,i,l ->

            val adapterView = null

        }


        val items1 = listOf("Viganagaram","Vizag","EastGodavari","WestGodavari","Krishna","Guntur","Prakasam","Nellore","Kadapa","Anantapur")

        val autoComplete1 : AutoCompleteTextView = findViewById(R.id.a2)

        val  adapter1 = ArrayAdapter(this,R.layout.data_list,items1)

        autoComplete1.setAdapter(adapter1)

        autoComplete1.onItemClickListener = AdapterView.OnItemClickListener{
                adapter1,view,i,l ->

            val adapterView = null

        }


        val items2 = listOf("6:00 AM","9:00AM","12:00AM","3:00AM","12:00PM","3:00PM","6:00PM","9:00PM")

        val autoComplete2 : AutoCompleteTextView = findViewById(R.id.a3)

        val  adapter2 = ArrayAdapter(this,R.layout.data_list,items2)

        autoComplete2.setAdapter(adapter2)

        autoComplete2.onItemClickListener = AdapterView.OnItemClickListener{
                adapter2,view,i,l ->

            val adapterView = null

        }




    }

    private fun dateFormat(yourDate: Any) {
        val formate1 = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(yourDate)
        val dateTxt = findViewById<TextView>(R.id.dateTxt)
        dateTxt.setText(
            formate1 + "\n"
        )

    }


}

private fun Nothing?.getItemAtPosition(i: Int): Any {
    return i

}
