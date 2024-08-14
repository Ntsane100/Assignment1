package com.example.assignment1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Declaring the views
        val ageNumber= findViewById<EditText>(R.id.ageNumber)
        val btnGenerate= findViewById<Button>(R.id.btnGenerate)
        val btnCancel= findViewById<Button>(R.id.btnClear)
        val txtResult= findViewById<TextView>(R.id.txtResult)
           btnGenerate?.setOnClickListener{
               val age = ageNumber.text.toString().toIntOrNull()
               if (age != null) {
                   val result = when (age) {
                       in 20..25 -> "River Phoenix"
                       in 26..35 -> "Heather O'Rourke"
                       in 35..45 -> "Lisa Lopez"
                       in 46..55->"Paul Walker"
                       in 56..67->"George Micheal"
                       in 68..78->"Diego Maradona"
                       in 79..85->"Paul Reubens"
                       in 86..90->"John Lewis"
                       in 91..95->"Colonel Sanders"
                       in 96..100->"Neal Arden"
                       else -> "Senior"
                   }
                   txtResult.text = "Age: $age\n${
                       when (result) {
                           "River Phoenix"->"River Phoenix died at the age of 23"
                           "Heather O'Rourke" -> "Heather died at the age of 27"
                           "Lisa Lopez" -> "Lisa died at the age of 36."
                           "Paul Walker" -> "Paul Walker died at the age of 48."
                           "George Michael"->"George Michael died at the age of 58"
                           "Diego Maradona"->"Diego Maradona died at the age of 69"
                           "Paul Reubens"->"Raul Reubens died at the age of 79"
                           "John Lewis"->"John Lewis died at the age of 87"
                           "Colonel Sanders"->"Colonel Sanders died at the age of 94"
                           "Neal Arden"->"Neal Arden died at the age of 98 "
                           
                           else -> "Error Enter age between 20 and 100."
                       }
                   }"
               } else {
                   txtResult.text = "Please enter a valid age."
               }
           }
           btnCancel?.setOnClickListener {
               ageNumber.text.clear()
                   }
               }
           }
