package com.example.baitap2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import android.window.OnBackInvokedCallback

class MainActivity2 : AppCompatActivity() {

    private lateinit var txtUser :TextView
    private lateinit var txtPass :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        txtUser = findViewById(R.id.txtUser)
        txtPass = findViewById(R.id.txtPass)

        val intent= intent
        val data = intent.getStringExtra("data")
        txtUser.text = data

        val data2 = intent.getStringExtra("data2")
        txtPass.text = data2

    }

}