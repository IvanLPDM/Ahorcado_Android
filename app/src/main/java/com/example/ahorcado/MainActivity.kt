package com.example.ahorcado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        //Thread.sleep(2000);
        //Seteamos el estilo de la aplicacion, para no poner el del splash screen
        //setTheme(R.style.AppTheme)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

