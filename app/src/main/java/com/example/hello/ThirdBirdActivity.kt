package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThirdBirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third_bird)
        val btnPrev1 = findViewById<ImageView>(R.id.btnPrev1)
        val btnNext3= findViewById<ImageView>(R.id.btnNext3)

        btnPrev1.setOnClickListener{ finish()}
        btnNext3.setOnClickListener{
            val intent= Intent(this,fourthBirdActivity::class.java)
            startActivity(intent)
        }
    }
}