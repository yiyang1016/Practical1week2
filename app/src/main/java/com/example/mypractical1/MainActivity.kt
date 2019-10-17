package com.example.mypractical1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)
        //val countButton: Button = findViewById(R.id.count_up)
        //countButton.setOnClickListener { countUp() }
    }

    private fun rollDice() {
        //Toast.makeText(this, "button clicked",
        //Toast.LENGTH_SHORT).show()

        diceImage.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())

        //val resultText: TextView = findViewById(R.id.result_text)
        //resultText.text = randomInt.toString()

        //val diceImage: ImageView = findViewById(R.id.dice_image)
        //diceImage.setImageResource(drawableResource)
    }

    //private fun countUp(){
    //   val resultText: TextView = findViewById(R.id.result_text)
    //
    //   if(resultText.text == "Hello World!"){
    //       resultText.text = "1"
    //   }else{
    //       var sum = resultText.text.toString().toInt()
    //       if(sum < 6)
    //           sum++
    //           resultText.text = sum.toString()
    //   }
    //}

    private fun getRandomDiceImage(): Int{
        val randomInt = Random().nextInt(6) + 1

        return when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
    }
}
