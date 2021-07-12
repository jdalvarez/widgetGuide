package com.example.widgetsguide

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class selActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sel)
    }

    fun validaSeleccion(view: View) {
       // val id = view.id.toString()
       // Log.d("mensaja", "$id")
        val id = view.id
        var msje = ""
        when(id){
            R.id.checkbox1 -> {
                if (view is CheckBox) {
                    if (view.isChecked) {
                        msje = "Activaste el checkbox1"
                    } else msje = "Desactivaste el checkbox1"
                }
            }

            R.id.checkbox2 ->{
                if (view is CheckBox) {
                    if (view.isChecked) {
                        msje = "Activaste el checkbox2"
                    } else msje = "Desactivaste el checkbox2"
                }
            }

            R.id.switch1 ->{
                if(view is Switch){
                    if(view.isChecked){
                        msje = "activaste el switch"
                    }else msje = "Desactivaste el switch"
                }
            }

            R.id.radiouno ->{
                msje = "seleccionaste la opcion 1"
            }

            R.id.radiodos ->{
                msje = "seleccionaste la opcion 2"
            }
        }
        Toast.makeText(this,msje,Toast.LENGTH_SHORT).show()
    }
}