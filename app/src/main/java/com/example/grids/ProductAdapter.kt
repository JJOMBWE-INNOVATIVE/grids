package com.example.grids

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ProductAdapter(var context: Context ,var list:ArrayList<Product>):BaseAdapter(){
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(p0: Int): Any {
        return list[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.newlayout, null, false)

        val imageId = view.findViewById<ImageView>(R.id.image)
        val nameId = view.findViewById<TextView>(R.id.name)
        val buttonId = view.findViewById<Button>(R.id.button)

        nameId.text = list[p0].name
        imageId.setImageResource(list[p0].image)
        buttonId.text = list[p0].name


        return view

    }

}