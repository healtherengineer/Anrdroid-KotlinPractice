package com.egebarisan.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var editText1: EditText
    lateinit var editText2: EditText
    lateinit var resultText: TextView
    var number1: Int? = null
    var number2: Int? = null
    var result: Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText1 = findViewById(R.id.editTextNumber1)
        editText2 = findViewById(R.id.editTextNumber2)
        resultText = findViewById(R.id.resultText)
    }

    fun mySum(view: View) {

        number1 = editText1.text.toString().toIntOrNull()
        number2 = editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {

            resultText.text = "Error!"

        } else {
            result = number1!! + number2!!
            resultText.text = "Result: ${result}"
        }


    }

    fun mySub(view: View) {
        number1 = editText1.text.toString().toIntOrNull()
        number2 = editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {

            resultText.text = "Error!"

        } else {
            result = number1!! - number2!!
            resultText.text = "Result: ${result}"
        }

    }

    fun multiple(view: View) {
        number1 = editText1.text.toString().toIntOrNull()
        number2 = editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {

            resultText.text = "Error!"

        } else {
            result = number1!! * number2!!
            resultText.text = "Result: ${result}"
        }

    }

    fun divide(view: View) {
        number1 = editText1.text.toString().toIntOrNull()
        number2 = editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {

            resultText.text = "Error!"

        } else {
            var res: Double = number1!!.toDouble() / number2!!.toDouble()

            resultText.text = "Result: ${res}"
        }

    }
}