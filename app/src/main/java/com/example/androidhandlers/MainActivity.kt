package com.example.androidhandlers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.androidhandlers.databinding.ActivityMainBinding

/*Gradle scripts/buildgraddle(Module)-> Activamos el view binding VERIFICAR!*/
//Creamos nueva actividad en java -> New Activity Empty
class MainActivity : AppCompatActivity() {
    //escoger correspondiente activity correspondiente a la pantalla
    private lateinit var binding:ActivityMainBinding
    private lateinit var myHandler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        myHandler=Handler(mainLooper)
        binding.btnEjecutar.setOnClickListener{
            cargarPantalla()
            //pasarPantalla()

        }
    }

    private fun cargarPantalla() {
        Thread{
            try {
                for (i in 0 .. 100){
                    Thread.sleep(500)
                    myHandler.post{
                        binding.apply {
                            txtPorcentaje.text="$i %"
                            pbProgreso.progress=i
                        }
                    }
                }

            }catch (e:InterruptedException){
                e.printStackTrace()

            }
        }.start()
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