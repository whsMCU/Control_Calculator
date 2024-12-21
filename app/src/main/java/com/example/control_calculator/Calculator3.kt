package com.example.control_calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Calculator3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator3)

        val Input_zero = findViewById<EditText>(R.id.editZero2)
        val Input_span = findViewById<EditText>(R.id.editSpan2)
        val Input_mA = findViewById<EditText>(R.id.editmA)
        val Cal_result = findViewById<Button>(R.id.btn_calc_result)
        val Output_result = findViewById<TextView>(R.id.text_result)

        val back2 = findViewById<Button>(R.id.btn_back2)


        Cal_result.setOnClickListener {
            val zero2 = Input_zero.text.toString().toFloat()
            val span2 = Input_span.text.toString().toFloat()
            val mA = Input_mA.text.toString().toFloat()
            //Toast.makeText(Calculator1.this, zero2 +"  "+ span2 +"  " + pressure, Toast.LENGTH_LONG).show();
            val m: Float
            val y: Float

            if (zero2 < 0) {
                m = (span2 - zero2) / 16
                y = (m * (mA - 4)) - zero2
            } else {
                m = (span2 - zero2) / 16
                y = m * (mA - 4)
            }
            Output_result.text = "$y Value"
        }


        back2.setOnClickListener { finish() }
    }
}