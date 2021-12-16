package com.egebarisan.methods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("onCreate called")
    }

    override fun onResume() {
        super.onResume()
        println("onResume called")
    }

    override fun onPause() {
        super.onPause()
        System.out.println()
        println("onPause called")
    }

    override fun onStop() {
        super.onStop()
        println("onStop called")
    }

    override fun onStart() {
        super.onStart()
        println("onStart called")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy called")
    }
}