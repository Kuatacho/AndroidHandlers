package com.example.androidhandlers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidhandlers.databinding.ActivityMainBinding

/*Gradle scripts/buildgraddle(Module)-> Activamos el view binding VERIFICAR!*/
//Creamos nueva actividad en java -> New Activity Empty
class MainActivity : AppCompatActivity() {
    //escoger correspondiente activity correspondiente a la pantalla
    private lateinit var binding:ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnEjecutar.setOnClickListener{pasarPantalla()}
    }

    private fun pasarPantalla() {
        val mensaje="Texto de Ejemplo"
        val numero =10
        //Intent para lanzar a una pantalla
        //Paso de datos a traves de algo denominado
        val intent=Intent(this,Bienvenida::class.java)
        intent.apply {
            putExtra("texto",mensaje)
            putExtra("valor",numero)
        }
        startActivity(intent)

    }
}