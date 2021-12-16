package com.egebarisan.intentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var input = findViewById<EditText>(R.id.input)
        var button = findViewById<Button>(R.id.goSecond)

        button.setOnClickListener(){

            intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("gelenyazi", input.text.toString())
            startActivity(intent)
        }









    }
}