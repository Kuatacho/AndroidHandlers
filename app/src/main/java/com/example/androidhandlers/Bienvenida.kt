package com.example.androidhandlers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidhandlers.databinding.ActivityBienvenidaBinding

class Bienvenida : AppCompatActivity() {
    private lateinit var binding:ActivityBienvenidaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityBienvenidaBinding.inflate(layoutInflater)

        setContentView(binding.root)
        //si esta pantalla ha sido lanzado producto de una Intencion en un objeto llammado intent
        //queda registro para ser utilizado
        val mensaje="""
            El texto es: ${intent.getStringExtra("texto")}
            El numero es: ${intent.getIntExtra("valor",0)}
        """.trimIndent()
        binding.txtResultado.text=mensaje
    }
}