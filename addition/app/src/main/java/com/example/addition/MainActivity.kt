package com.example.addition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1= findViewById<EditText>(R.id.ed1)
        val num2= findViewById<EditText>(R.id.ed2)
        val tot= findViewById<EditText>(R.id.ed3)
        val b1=findViewById<Button>(R.id.btn1)
        val b2=findViewById<Button>(R.id.btn2)

        b1.setOnClickListener{

            val val1 = num1.text.toString().toInt()
            val val2 = num2.text.toString().toInt()
            val result= val1 + val2;
            tot.setText(result.toString())
        }

        b2.setOnClickListener{
            num1.setText(" ")
            num2.setText(" ")
            tot.setText(" ")
        }

    }
}