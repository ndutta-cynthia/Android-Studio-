package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.LayoutInflaterCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityFourthBirdBinding
import com.example.hello.databinding.ActivitySecondBirdBinding
import com.squareup.picasso.Picasso

class fourthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFourthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev2.setOnClickListener{
            val intent=Intent(this,ThirdBirdActivity::class.java)
            startActivity(intent)
        }
        binding.btnNext4.setOnClickListener {
            val intent = Intent(this,fifthBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso.get()
            .load("https://images.unsplash.com/photo-1548960095-770e3e6364de?q=80&w=1970&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
            .into(binding.imageView15)
    }
}