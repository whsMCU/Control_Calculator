package com.example.control_calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Calculator0 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator0)

        val zero = findViewById<EditText>(R.id.editZero)
        val span = findViewById<EditText>(R.id.editSpan)
        val result_0 = findViewById<TextView>(R.id.text_result0)
        val result_1 = findViewById<TextView>(R.id.text_result1)
        val result_2 = findViewById<TextView>(R.id.text_result2)
        val result_3 = findViewById<TextView>(R.id.text_result3)
        val result_4 = findViewById<TextView>(R.id.text_result4)
        val calc = findViewById<Button>(R.id.btn_calc1)
        val back = findViewById<Button>(R.id.btn_back)

        calc.setOnClickListener {
            val input_zero = zero.text.toString().toInt()
            val input_span = span.text.toString().toInt()
            val tmp = (input_span.toFloat() - input_zero.toFloat()) / 4
            //Toast.makeText(Calculator.this, "Result"+tmp, Toast.LENGTH_LONG).show();
            result_0.text = "    0 % : " + input_zero.toFloat().toString()
            result_1.text = "  25 % : " + (input_zero + tmp).toString()
            result_2.text = "  50 % : " + (input_zero + (2 * tmp)).toString()
            result_3.text = "  75 % : " + (input_zero + (3 * tmp)).toString()
            result_4.text = "100 % : " + input_span.toFloat().toString()
        }


        back.setOnClickListener { finish() }
    }
}