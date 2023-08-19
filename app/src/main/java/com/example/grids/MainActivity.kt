package com.example.grids

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import com.example.grids.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val myList = ArrayList<Product>()
        myList.add(Product(R.drawable.image,"Nathan"))
        myList.add(Product(R.drawable.image2,"Nisha"))
        myList.add(Product(R.drawable.image,"Ivan"))
        myList.add(Product(R.drawable.image,"Stephen"))
        myList.add(Product(R.drawable.image,"John"))
        myList.add(Product(R.drawable.image,"Ben"))

        val myAdapter = ProductAdapter(this,myList)
        val grid = binding.grid
        grid.adapter = myAdapter


    }
}