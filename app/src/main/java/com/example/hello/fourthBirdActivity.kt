package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class fourthBirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fourth_bird)
        val btnPrev2= findViewById<ImageView>(R.id.btnPrev2)
        val btnNext4= findViewById<ImageView>(R.id.btnNext4)

        btnPrev2.setOnClickListener{ finish()}
        btnNext4.setOnClickListener{
            val intent= Intent(this,fifthBirdActivity::class.java)
            startActivity(intent)
        }
    }
}