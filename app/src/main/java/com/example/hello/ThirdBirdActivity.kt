package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ThirdBirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev1.setOnClickListener{
            val intent=Intent(this,SecondBirdActivity::class.java)
            startActivity(intent)
        }

        binding.btnNext3.setOnClickListener {
            val intent = Intent(this,fourthBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso.get()
            .load("https://images.unsplash.com/photo-1497206365907-f5e630693df0?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTZ8fGJpcmR8ZW58MHx8MHx8fDA%3D")
            .into(binding.imageView6)
    }
}
