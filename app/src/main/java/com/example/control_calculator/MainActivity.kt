package com.example.control_calculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.control_calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(binding.root)

        val recycler_view = findViewById<RecyclerView>(R.id.recycler_view)
        val itemList = ArrayList<Calculator_Item>()
        itemList.add(Calculator_Item(R.drawable.baseline_calculate_black_48dp,"0~100% 보기", "LRV와 URV를 입력하면 25% 단위로 출력"))
        itemList.add(Calculator_Item(R.drawable.baseline_calculate_black_48dp,"mA to percent 계산", "mA를 입력하면 %로 출력"))
        itemList.add(Calculator_Item(R.drawable.baseline_calculate_black_48dp,"mA로 계산", "Zero, Span, Value를 입력하면 mA로 출력"))
        itemList.add(Calculator_Item(R.drawable.baseline_calculate_black_48dp,"Value로 계산", "Zero, Span, mA 입력하면 Value로 출력"))
        itemList.add(Calculator_Item(R.drawable.baseline_calculate_black_48dp,"점검시트", "점검시트"))

        val Adapter = Calculator_Adapter(itemList)
        Adapter.notifyDataSetChanged()

        recycler_view.adapter = Adapter
        recycler_view.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)


//        val btnMove : Button = findViewById(R.id.button)
//        val intent = Intent(this@MainActivity, SubActivity::class.java)
//
//        btnMove.setOnClickListener {
//            startActivity(intent)
//        }
    }
}