package com.example.android.direroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton:Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

    }

    private fun rollDice(){
        //Random and display the num
        val randomInt = Random().nextInt(6) + 1
        val resultText:TextView =findViewById(R.id.result_text)
        resultText.text=randomInt.toString()


        // Display the toast
        Toast.makeText(this, "Dice Rolled",
            Toast.LENGTH_SHORT).show()
        // end of the code of display the toast

    }
}
