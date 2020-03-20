package com.example.chopstickpanda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
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
    }


}
