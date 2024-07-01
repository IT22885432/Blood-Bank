package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class signin_login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signin_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var btn4 = findViewById<Button>(R.id.button4)
        btn4.setOnClickListener(){
            val intent = Intent(this,logIn::class.java)
            startActivity(intent)
        }


        var btn5 = findViewById<Button>(R.id.button5)
        btn5.setOnClickListener(){
            val intent = Intent(this,sign_up::class.java)
            startActivity(intent)
        }

    }




}