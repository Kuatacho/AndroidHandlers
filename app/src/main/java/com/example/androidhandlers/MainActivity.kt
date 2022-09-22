package com.example.androidhandlers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
/*Gradle scripts/buildgraddle(Module)-> Activamos el view binding VERIFICAR!*/
//Creamos nueva actividad en java -> New Activity Empty
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}