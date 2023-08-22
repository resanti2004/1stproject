package com.example.a1stproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.a1stproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            btnTest1.setOnClickListener{
                Toast.makeText(this@MainActivity, "Hallo Teman Teman", Toast.LENGTH_SHORT).show()
            }
        }
    }
}