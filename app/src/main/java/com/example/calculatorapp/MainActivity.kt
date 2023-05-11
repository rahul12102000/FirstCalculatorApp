package com.example.calculatorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.calculatorapp.R.*
import com.example.calculatorapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewbinding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewbinding.root)
        viewbinding.Plus.setOnClickListener{
            val input1=viewbinding.Input1.text.toString().toInt()
            val input2=viewbinding.Input2.text.toString().toInt()
            viewbinding.textView.text=(input1+input2).toString()
        }
        viewbinding.Minus.setOnClickListener{
            val input1=viewbinding.Input1.text.toString().toInt()
            val input2=viewbinding.Input2.text.toString().toInt()
            viewbinding.textView.text=(input1-input2).toString()
        }
        viewbinding.Divide.setOnClickListener{
            val input1=viewbinding.Input1.text.toString().toInt()
            val input2=viewbinding.Input2.text.toString().toInt()
            viewbinding.textView.text=(input1/input2).toString()
        }
        viewbinding.Multiply.setOnClickListener{
            val input1=viewbinding.Input1.text.toString().toInt()
            val input2=viewbinding.Input2.text.toString().toInt()
            viewbinding.textView.text=(input1*input2).toString()
        }
        val backbtn=findViewById<Button>(R.id.Back)
        backbtn.setOnClickListener {
            intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }

}