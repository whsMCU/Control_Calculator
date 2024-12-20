package com.example.control_calculator

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Calculator_Adapter(val itemList: ArrayList<Calculator_Item>) :
    RecyclerView.Adapter<Calculator_Adapter.Calculator_ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Calculator_ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rycyclerview_calculator, parent, false)
        return Calculator_ViewHolder(view)
    }

    override fun onBindViewHolder(holder: Calculator_ViewHolder, position: Int) {
        holder.calculator_image = itemList[position].imageview
        holder.calculator_name.text = itemList[position].name
        holder.calculator_description.text = itemList[position].description
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