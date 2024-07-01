package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dashboard)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var img1 = findViewById<ImageView>(R.id.imageView6)
        img1.setOnClickListener(){
            val intent = Intent(this,request_blood::class.java)
            startActivity(intent)
        }

        var img2 = findViewById<ImageView>(R.id.imageView8)
        img2.setOnClickListener(){
            val intent = Intent(this,donate_blood::class.java)
            startActivity(intent)
        }

        var img3 = findViewById<ImageView>(R.id.imageView10)
        img3.setOnClickListener(){
            val intent = Intent(this,blood_bank::class.java)
            startActivity(intent)
        }

        var img4= findViewById<ImageView>(R.id.imageView11)
        img4.setOnClickListener(){
            val intent = Intent(this,profile::class.java)
            startActivity(intent)
        }

    }
}