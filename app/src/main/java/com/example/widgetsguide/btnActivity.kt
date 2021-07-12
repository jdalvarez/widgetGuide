package com.example.widgetsguide

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.widgetsguide.databinding.ActivityBtnBinding

class btnActivity : AppCompatActivity() {
    lateinit var binding:ActivityBtnBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBtnBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun mostrarBtnSel(view: View) {
        var tag = view.tag
        var mensaje = ""
        when(tag){
            "Saludar" ->{
                mensaje = "Presionaste el boton normal"
            }

            "eMail" ->{
                mensaje = "Presionaste el ImageButton"
            }

        }
        Toast.makeText(this,mensaje, Toast.LENGTH_LONG).show()
    }
}