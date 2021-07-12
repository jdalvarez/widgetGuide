package com.example.widgetsguide

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.widgetsguide.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding //view binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.widText.setOnClickListener{
            val intent = Intent(this, TextActivity::class.java)
            startActivity(intent)
        }

        binding.btn.setOnClickListener{
            val intent2 = Intent(this, btnActivity::class.java)
            startActivity(intent2)
        }

        binding.selection.setOnClickListener{
            val intent3 = Intent(this, selActivity::class.java)
            startActivity(intent3)
        }

        binding.registro.setOnClickListener{
            val intent4 =Intent( this,RegisterActivity::class.java)
            startActivity(intent4)
        }
    }



}