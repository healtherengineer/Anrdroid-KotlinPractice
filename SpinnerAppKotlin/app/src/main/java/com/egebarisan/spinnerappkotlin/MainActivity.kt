package com.egebarisan.spinnerappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //We put a spinner and textview in our app

        var spinner = findViewById<Spinner>(R.id.spinner)
        var text = findViewById<TextView>(R.id.text1)
        //We create an array which we will connect with spinner
        val colors = arrayOf("Red" , "Green" , "Blue" , "Purple" , "Yellow", "Black")
        //We binded array and arrayadapter
        val adapter = ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line , colors)
        //We add a layout in android to adapter
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        //We collected adapter and spinner's adapter
        spinner.adapter = adapter
        //and finally we used spinner's function (onItemSelectedListener)
        spinner.onItemSelectedListener = object :

    AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, p1: View?, position: Int, p3: Long) {adapter

                text.text = parent?.getItemAtPosition(position).toString() +" is selected."

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
          //  Toast.makeText(applicationContext , "Nothing Selected" , Toast.LENGTH_LONG).show()

            }

    }

    }
}