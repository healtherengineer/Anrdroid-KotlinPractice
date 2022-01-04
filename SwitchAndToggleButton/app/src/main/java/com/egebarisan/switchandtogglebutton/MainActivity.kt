package com.egebarisan.switchandtogglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var switch = findViewById<Switch>(R.id.switchButton)
        var toggle = findViewById<ToggleButton>(R.id.toggleButton)

        switch.setOnCheckedChangeListener{ buttonView,ischecked ->

            if (ischecked)
            {
                    Toast.makeText(applicationContext , "Switch Açıldı" , Toast.LENGTH_LONG).show()
            }
            else
            {
                Toast.makeText(applicationContext , "Swich kapalı" , Toast.LENGTH_LONG).show()
            }
        }
            toggle.setOnCheckedChangeListener{ buttonView , ischecked->
                if (ischecked)
                {
                    Toast.makeText(applicationContext , "Toggle Button is Active" , Toast.LENGTH_LONG).show()
                }
                else
                {
                    Toast.makeText(applicationContext , "Toggle Button is NonActive" , Toast.LENGTH_LONG).show()
                }
            }

    }
}