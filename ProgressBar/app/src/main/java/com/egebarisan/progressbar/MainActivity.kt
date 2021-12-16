package com.egebarisan.progressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var progess = findViewById<ProgressBar>(R.id.progress)

    }

    fun start(view :View){
        var progess = findViewById<ProgressBar>(R.id.progress)

        progess.visibility = View.VISIBLE
    }
    fun stop(view :View){
        var progess = findViewById<ProgressBar>(R.id.progress)

        progess.visibility = View.INVISIBLE


    }
}