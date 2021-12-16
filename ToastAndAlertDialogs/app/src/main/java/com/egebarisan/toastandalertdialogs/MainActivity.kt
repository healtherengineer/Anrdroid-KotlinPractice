package com.egebarisan.toastandalertdialogs

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.graphics.toColorInt
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var toastButton = findViewById<Button>(R.id.toastButton)
        var specialToastButton = findViewById<Button>(R.id.speacialToast)
        var snackButton = findViewById<Button>(R.id.snackBar)
        var alertButton = findViewById<Button>(R.id.AlertButton)

    }

    fun sendToast(view: View) {

        Toast.makeText(applicationContext, "This is my first Toast Message", Toast.LENGTH_LONG)
            .show()
        //  .setGravity(150,200,1000)


    }

    fun sendSpecialToast(view: View) {
        //neden root null yaptık
        // button la layout üst üste gelince layout görünmemesi normal mi ?
        // veya background eklemedik diye mi ?
        val layout = layoutInflater.inflate(R.layout.custom_toast, null)
        val myToast = Toast(applicationContext)
        myToast.duration = Toast.LENGTH_LONG
        myToast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        myToast.view = layout //Setting the custom layout to view of the Toast
        myToast.show()


    }

    fun sendSnackBar(view: View) {
        val snackNormal = Snackbar.make(view, "Değişiklikler kaydedilsin mi ?", Snackbar.LENGTH_LONG)
        snackNormal.setAction("Geri Al") {/* Geri Al' basılınca ne olmasını istediğini yaz Mesela bir toast message uydur*/
            //  var toast = Toast.makeText(applicationContext ,"Geri Al tuşuna basıldı !" , Toast.LENGTH_LONG).show()
            Snackbar.make(view, "Geri Alındı :)", Snackbar.LENGTH_SHORT).show()

        }
//        neden 2 tane seçenek koyamıyorum
//        snackNormal.setAction("Onayla"){
//            Snackbar.make(view, "Onaylandı:)", Snackbar.LENGTH_SHORT).show()
//        }
        //color ekleyebiliriz böyle .
        snackNormal.setTextColor("#fcba03".toColorInt())
        snackNormal.setActionTextColor("#FFFFFF".toColorInt())

            .show()

    }

    fun sendAlertDialog(view: View) {

        val alertDialog = AlertDialog.Builder(this@MainActivity)
        alertDialog.setMessage("Magnolia123 yalnız yaşama hayalini onaylıyor musun ? ")
            .setTitle("Kararınız ? ")
            .setIcon(R.drawable.logo2)
        alertDialog.setPositiveButton("Evet") { dialogInterface, i ->

            Snackbar.make(view, "Bırakın ne hali varsa görsün !!! ", Snackbar.LENGTH_LONG).show()


        }
        alertDialog.setNegativeButton("Hayır") { dialogInterface, i ->

            Snackbar.make(view, "Dilara ile Ege kardeş kardeş yaşasın mı ?", Snackbar.LENGTH_LONG)
                .setAction("Evet :)") {
                    Toast.makeText(applicationContext, "Aferini kaptın gene :) ", Toast.LENGTH_LONG)
                        .show()
                }
                .show()

            //   sendSnackBar(view) --> text parametre ekleyip kullanabilirsin


        }
            .show()


    }
}