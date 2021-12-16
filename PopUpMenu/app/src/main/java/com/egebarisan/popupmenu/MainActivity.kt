package com.egebarisan.popupmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button = findViewById<Button>(R.id.popUpButton)

    }
    //Notes :
//    Pop up menu yapmak için öncelikle bir menu kaynak dosyası açıyoruz res de
//    popup_menu.xml anroid dosyası ekleyerek popup ımızın tasarımını yapıyoruz
//    daha sonrasında main activity de bir button yerleştirip onclick olduğunda
//    bir popup nesnesi oluşturup menuInflater ile inflate liyoruz .
//    daha sonrasında popup menu müzdeki itemların id leriyle yapmak istediklerimizi yazıyoruz

    fun showPopUp(view: View) {
        var button = findViewById<Button>(R.id.popUpButton)
        val popupMenu = PopupMenu(this@MainActivity, button)
        //Burası çok önemli
        popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
        popupMenu.setOnMenuItemClickListener { i ->
            when (i.itemId) {
                R.id.cricket -> {
                    Toast.makeText(applicationContext, "Cricket'e tıkladınız", Toast.LENGTH_LONG)
                        .show()

                }

                R.id.football -> {
                    Toast.makeText(applicationContext, "Footbal'a tıkladınız", Toast.LENGTH_LONG)
                        .show()

                }


                R.id.hockey -> {
                    Toast.makeText(applicationContext, "Hockey'e tıkladınız", Toast.LENGTH_LONG)
                        .show()

                }


            }
            true
        }
        popupMenu.show()


    }
}