package com.example.chopstickpanda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOpenActivity : Button = findViewById(R.id.order)
        btnOpenActivity.setOnClickListener {
            val intent = Intent(this, ravintola_sivu :: class.java)
            // start your next activity
            startActivity(intent)
        }

        // TODO:
        // THIS should move to homefragment class
        // all ravintolasivu
        // it show the product data to recyclerview
        // search how to execute for example fragment page onCreate class in fragment page in android studio?


        // this for ravintolasivu = fragment home
        /*
        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val products = ArrayList<Product>()

        products.add(Product("rohis", "hyvinkää"))
        products.add(Product("asla", "ok"))
        products.add(Product("asla", "ok"))
        products.add(Product("asla", "ok"))

        val adapter = ProductAdapter(products)
        recyclerView.adapter = adapter

         */
        // ravintolasivu end

    }


}
