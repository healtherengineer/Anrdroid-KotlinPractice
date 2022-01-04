package com.egebarisan.intentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var backButton = findViewById<Button>(R.id.backButton)
        var textView = findViewById<TextView>(R.id.textSecond)

        var word = intent.getStringExtra("gelenyazi").toString()


        if (word != null)
        {
            textView.setText(word)
            Toast.makeText(applicationContext,word,Toast.LENGTH_LONG).show()

        }
        else
        {
          Toast.makeText(applicationContext,"Geçersiz" , Toast.LENGTH_LONG)
        }


        backButton.setOnClickListener(){

            textView.setText("MainActivity'e dönülüyor ...")

            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }


    }
}