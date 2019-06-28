package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcularEdad(view:View){

        try {
            val anioNacimiento:Int = txtAnioNacimiento.text.toString().toInt()
            val anioActual:Int= Calendar.getInstance().get(Calendar.YEAR)

            if(anioNacimiento>1900 && anioNacimiento<anioActual){

                val edad= anioActual-anioNacimiento
                txtVistaEdad.text= "tu edad es $edad años"
            }else{

                txtVistaEdad.text="INGRESE UN AÑO VALIDO"
            }
        }catch (e:Exception){
            txtVistaEdad.text="INGRESE UN DATO VALIDO"

        }
    }
}
