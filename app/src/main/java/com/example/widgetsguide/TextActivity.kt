package com.example.widgetsguide

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.widgetsguide.databinding.ActivityTextBinding


class TextActivity : AppCompatActivity() {
    lateinit var binding:ActivityTextBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTextBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnText.setOnClickListener{
            var nombre = binding.editText.text.toString()
            var numero = binding.editTextNumber.text.toString()

            Toast.makeText(this,"Hola $nombre, tu numero es $numero", Toast.LENGTH_LONG).show()

        }
    }
}