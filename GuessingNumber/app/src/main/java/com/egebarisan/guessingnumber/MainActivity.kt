package com.egebarisan.guessingnumber

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var guessInput:EditText
    lateinit var guessButton: Button
    lateinit var state : TextView
    var generatedNumber:Int = (0..100).random()
    var myGuess:Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        guessInput = findViewById(R.id.guessInput)
        guessButton = findViewById(R.id.guessButton)
        state = findViewById(R.id.stateText)
    }

    fun restart(view: View){
        val tempBundle = Bundle()
        onCreate(tempBundle)

    }
    fun sendGuess(view: View){
        myGuess = guessInput.text.toString().toIntOrNull()
        if(myGuess == null){
            state.text = "Error you cannot leave empty"
        }
        else if(myGuess!! >100){
            state.text = "Please enter numbers between 0 - 100"
        }
        else if(myGuess!! > generatedNumber){
            state.text = "You are very close ,but enter smaller number than ${myGuess}"

        }
        else if(myGuess!! < generatedNumber){
            state.text = "You are very close ,but enter bigger number than ${myGuess}"

        }
        else{
            state.text = "You won!!! Congratulations The generated number is ${generatedNumber}"
        }


    }
}