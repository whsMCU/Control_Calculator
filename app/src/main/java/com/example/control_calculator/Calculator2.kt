package com.example.control_calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Calculator2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator2)

        val Input_zero = findViewById<EditText>(R.id.editZero2)
        val Input_span = findViewById<EditText>(R.id.editSpan2)
        val Input_Value = findViewById<EditText>(R.id.editValue)
        val Cal_result = findViewById<Button>(R.id.btn_calc_result)
        val Output_result = findViewById<TextView>(R.id.text_result)

        val back2 = findViewById<Button>(R.id.btn_back2)


        Cal_result.setOnClickListener {
            val zero2 = Input_zero.text.toString().toFloat()
            val span2 = Input_span.text.toString().toFloat()
            val pressure = Input_Value.text.toString().toFloat()
            //Toast.makeText(Calculator1.this, zero2 +"  "+ span2 +"  " + pressure, Toast.LENGTH_LONG).show();
            //y=mx+b
            val m = 16 / (span2 - zero2)
            val y = (m * pressure) + 4
            Output_result.text = "$y mA"
        }


        back2.setOnClickListener { finish() }
    }
}