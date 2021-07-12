package com.example.widgetsguide

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.widgetsguide.databinding.ActivityRegisterBinding


class RegisterActivity : AppCompatActivity() {
    lateinit var binding:ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registrar.setOnClickListener{
            var email = binding.correo.text.toString()
            var pass = binding.password.text.toString()
            var sex =""
            if(binding.fem.isChecked ){
                sex = "Female"
            } else if(binding.mascu.isChecked){
                sex = "Male"
            }

            Toast.makeText(this, "Email: $email \n Pass: $pass \n Sex: $sex ", Toast.LENGTH_LONG).show()
        }
    }
}