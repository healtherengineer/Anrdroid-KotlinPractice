package com.egebarisan.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var acilis = findViewById<Button>(R.id.acilis)
        var bir = findViewById<Button>(R.id.bir)
        var iki = findViewById<Button>(R.id.iki)
        var uc = findViewById<Button>(R.id.uc)

        bir.setOnClickListener(){

            fragmentCagir(fr1())

        }
        iki.setOnClickListener(){
            fragmentCagir(fr2())
        }
        uc.setOnClickListener(){
            fragmentCagir(fr3())
        }
        acilis.setOnClickListener(){
            fragmentCagir(acilis())
        }

    }

    fun fragmentCagir(fragment: Fragment){
    val fragmentgecis = supportFragmentManager.beginTransaction()
        fragmentgecis.replace(R.id.frcontainer , fragment)
        fragmentgecis.commit()


    }
}