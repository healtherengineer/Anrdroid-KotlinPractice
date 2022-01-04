package com.egebarisan.floatingactionbuttonandseekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.PopupMenu
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var seekBar = findViewById<SeekBar>(R.id.seekBar)
        var rateBoard = findViewById<TextView>(R.id.rateBoard)
        var general : Int = 0 ;
        seekBar?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onStopTrackingTouch(p0: SeekBar?) {
              //  Toast.makeText(applicationContext,"Seekbar touch stopped" , Toast.LENGTH_LONG).show()

                rateBoard.text = "You left the seekBar, SeekBar : "  + general

            }
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                 //    Toast.makeText(applicationContext,"Seekbar : ${p1}" , Toast.LENGTH_LONG).show()
                general = p1
                rateBoard.text = "SeekBar : "+p1.toString()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
               // Toast.makeText(applicationContext,"Seekbar touch started" , Toast.LENGTH_LONG).show()

                rateBoard.text = "This is your first tocuh SeekBar : " + general
            }




        })
    }

    fun onFloating(view: View) {
        val floatingButton = findViewById<FloatingActionButton>(R.id.floatingActionButton)

//        Toast.makeText(applicationContext,"Floating Action Button'a tıkladınız ." , Toast.LENGTH_LONG)
//            .show()

        val popupMenu = PopupMenu(this, floatingButton)
        popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
        //  EN ÖNEMLİ KOD BU MENU İNFLATERRRRRR
        popupMenu.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.ekle -> {
                    Snackbar.make(view, "Eklendi :)", Snackbar.LENGTH_LONG).show()
                }
                R.id.sil -> {
                    Snackbar.make(view, "Silindi :)", Snackbar.LENGTH_LONG).show()

                }
                R.id.vazgec -> {
                    Snackbar.make(view, "Vazgeçildi :)", Snackbar.LENGTH_LONG).show()

                }


            }
            true
        }
        popupMenu.show()
    }
}