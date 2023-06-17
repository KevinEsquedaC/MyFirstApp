package com.example.myfirstapp

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MyFirstActivity : Activity(){

    lateinit var contadortv : TextView
    lateinit var btnclk : Button
    var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_my_first)

        contadortv = findViewById(R.id.tvcontador)
        btnclk = findViewById(R.id.buttonsum)

        btnclk.setOnClickListener(){
            contador++
            contadortv.text = contador.toString()
        }
    }

    override fun onResume() {
        super.onResume()

        /*val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://www.google.com")
        startActivity(intent)*/

        /*val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)*/

        // TODO mandar mensaje
        Toast.makeText(this, "Hola", Toast.LENGTH_LONG).show()
    }
}