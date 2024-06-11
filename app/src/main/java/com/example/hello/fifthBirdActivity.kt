package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityFifthBirdBinding
import com.example.hello.databinding.ActivityFourthBirdBinding
import com.squareup.picasso.Picasso

class fifthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFifthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFifthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev3.setOnClickListener {
            val intent = Intent(this, fourthBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso.get()
            .load("https://images.unsplash.com/photo-1550853024-fae8cd4be47f?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjR8fGJpcmR8ZW58MHx8MHx8fDA%3D")
            .into(binding.imageView11)
    }
}
