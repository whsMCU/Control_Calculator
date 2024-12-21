package com.example.control_calculator

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class Calculator_Adapter(val itemList: ArrayList<Calculator_Item>) :
    RecyclerView.Adapter<Calculator_Adapter.Calculator_ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Calculator_ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rycyclerview_calculator, parent, false)
        return Calculator_ViewHolder(view).apply {
            itemView.setOnClickListener {
                val curPos : Int = adapterPosition
                val calculator: Calculator_Item = itemList.get(curPos)
                Toast.makeText(parent.context, "계산기 : ${calculator.name}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onBindViewHolder(holder: Calculator_ViewHolder, position: Int) {
        holder.calculator_image.setImageResource(itemList[position].Drawable)
        holder.calculator_name.text = itemList[position].name
        holder.calculator_description.text = itemList[position].description

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView?.context, "계산기 : ${itemList[position].name}", Toast.LENGTH_SHORT).show()
            var intent: Intent? = null
            when(position){
                0 -> intent = Intent(holder.itemView?.context, Calculator0::class.java)
                1 -> intent = Intent(holder.itemView?.context, Calculator1::class.java)
                2 -> intent = Intent(holder.itemView?.context, Calculator2::class.java)
                3 -> intent = Intent(holder.itemView?.context, Calculator3::class.java)
                4 -> intent = Intent(holder.itemView?.context, CheckSheet::class.java)
            }

            if (intent != null) {
                ContextCompat.startActivity(holder.itemView.context, intent, null)
            }
        }
    }

    override fun getItemCount(): Int {
        return itemList.count()
    }

    inner class Calculator_ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var calculator_image = itemView.findViewById<ImageView>(R.id.calculator_picture)
        val calculator_name = itemView.findViewById<TextView>(R.id.calculator_Name)
        val calculator_description = itemView.findViewById<TextView>(R.id.calculator_Description)

    }
}