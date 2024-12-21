package com.example.control_calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Calculator1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator1)

        val Input_mA = findViewById<EditText>(R.id.edit_mA)
        val Output_Percent = findViewById<TextView>(R.id.text_result_Percent)
        val Cal_Percent = findViewById<Button>(R.id.btn_calc2)

        val back1 = findViewById<Button>(R.id.btn_back1)

        Cal_Percent.setOnClickListener {
            val mA = Input_mA.text.toString().toInt()
            val tmp2 = ((mA.toFloat() - 4) / (20 - 4)) * 100
            Output_Percent.text = "$tmp2 %"
            //Toast.makeText(Calculator1.this, "result "+ mA +" "+ tmp, Toast.LENGTH_LONG).show();
        }

        back1.setOnClickListener { finish() }
    }
}