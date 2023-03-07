package com.example.diceroller

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var dado : ImageView
    lateinit var dado2: ImageView
    lateinit var boton : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton = findViewById(R.id.boton)
        dado = findViewById(R.id.dado)
        dado2 = findViewById(R.id.dado2)
        boton.setOnClickListener {
            Toast.makeText(applicationContext,
                "Boton presionado", Toast.LENGTH_LONG ).show()
            dado.setImageDrawable(getRandomDiceImage())
            dado2.setImageDrawable(getRandomDiceImage())

        }
    }

    private fun getRandomDiceImage() : Drawable {
        var lado : Drawable
        val aleato = (1..6).random()
        when(aleato) {
            1 -> {
                lado = getDrawable(R.drawable.perspective_dice_six_faces_one)!!
            }
            2 -> {
                lado = getDrawable(R.drawable.perspective_dice_six_faces_two)!!
            }
            3 -> {
                lado = getDrawable(R.drawable.perspective_dice_six_faces_three)!!
            }
            4 -> {
                lado = getDrawable(R.drawable.perspective_dice_six_faces_four)!!
            }
            5 -> {
                lado = getDrawable(R.drawable.perspective_dice_six_faces_five)!!
            }
            6 -> {
                lado = getDrawable(R.drawable.perspective_dice_six_faces_five)!!
            }
            else -> {
                lado= getDrawable(R.drawable.ic_task_completed)!!
            }
        }
        return lado
    }

    fun diceRoller(par: Int = 0): Int{
        return (1..6).random()
    }


}

