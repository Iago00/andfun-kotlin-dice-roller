
package com.example.android.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    //definimos ImageView
    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //definimos el boton tirar dado
        val rollButton: Button = findViewById(R.id.roll_button)
        //llama a la función rollDice cuando se hace click en el boton de tirar
        rollButton.setOnClickListener {
            rollDice()
        }

        diceImage = findViewById(R.id.dicce_image)//se carga el ImageView
        diceImage.setImageResource(R.drawable.dado)//se muestra una imagen dentro del ImageView
    }

    private fun rollDice() {
        //generamos un numero aleatorio con la función random
        val randomInt = Random().nextInt(6) + 1
        //dependiendo del numero que salga de la función random se muestra una imagen diferente
        val drawableResource = when (randomInt) {
            1 -> diceImage.setImageResource(R.drawable._1)
            2 -> diceImage.setImageResource(R.drawable._2)
            3 -> diceImage.setImageResource(R.drawable._3)
            4 -> diceImage.setImageResource(R.drawable._4)
            5 -> diceImage.setImageResource(R.drawable._5)
            else -> diceImage.setImageResource(R.drawable._6)
        }
    }
}