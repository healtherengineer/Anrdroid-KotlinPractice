package com.egebarisan.advancedcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun butonTik(view: View) {

        var sayi0 = findViewById<Button>(R.id.sayi0)
        var sayi1 = findViewById<Button>(R.id.sayi1)
        var sayi2 = findViewById<Button>(R.id.sayi2)
        var sayi3 = findViewById<Button>(R.id.sayi3)
        var sayi4 = findViewById<Button>(R.id.sayi4)
        var sayi5 = findViewById<Button>(R.id.sayi5)
        var sayi6 = findViewById<Button>(R.id.sayi6)
        var sayi7 = findViewById<Button>(R.id.sayi7)
        var sayi8 = findViewById<Button>(R.id.sayi8)
        var sayi9 = findViewById<Button>(R.id.sayi9)

        var hesaplama = findViewById<TextView>(R.id.hesaplama)

        if (yeniOperator) {
            hesaplama.text = ""
        }
        //yeni operatörü false yapmamız lazım
        yeniOperator = false
        var butonSec = view as Button
        var butonDeger = hesaplama.text.toString()
        when (butonSec.id) {

            sayi0.id -> {
                //boşken 0  basıldığında sadece 0 yazsın bunu büyüktür küçüktür kontrolü yaparak yapabilirsin
                butonDeger += "0"
            }
            sayi1.id -> {
                butonDeger += "1"
            }
            sayi2.id -> {
                butonDeger += "2"
            }
            sayi3.id -> {
                butonDeger += "3"
            }
            sayi4.id -> {
                butonDeger += "4"
            }
            sayi5.id -> {
                butonDeger += "5"
            }
            sayi6.id -> {
                butonDeger += "6"
            }
            sayi7.id -> {
                butonDeger += "7"
            }
            sayi8.id -> {
                butonDeger += "8"
            }
            sayi9.id -> {
                butonDeger += "9"
            }

        }
        hesaplama.setText(butonDeger)

    }

    var operator = "*"
    var eskiSayi = ""
    var yeniOperator = true

    fun buttonIslem(view: View) {
        var hesaplama = findViewById<TextView>(R.id.hesaplama)
        var buttonSec2 = view as Button

        var bolu = findViewById<Button>(R.id.bolu)
        var carpi = findViewById<Button>(R.id.carpi)
        var arti = findViewById<Button>(R.id.toplam)
        var eksi = findViewById<Button>(R.id.cikarma)


        when (buttonSec2.id) {
            bolu.id -> {
                operator = "/"
            }
            carpi.id -> {
                operator = "*"
            }
            arti.id -> {
                operator = "+"
            }
            eksi.id -> {
                operator = "-"
            }

        }
        eskiSayi = hesaplama.text.toString()
        yeniOperator = true

    }


    fun buttonHesapla(view: View) {

        var hesaplama = findViewById<TextView>(R.id.hesaplama)
        var yeniSayi = hesaplama.text.toString()
        var sonuc: Double? = null
        when (operator) {
            "*" -> {
                sonuc = eskiSayi.toDouble() * yeniSayi.toDouble()
            }
            "+" -> {
                sonuc = eskiSayi.toDouble() + yeniSayi.toDouble()
            }
            "-" -> {
                sonuc = eskiSayi.toDouble() - yeniSayi.toDouble()
            }
            "/" -> {

                sonuc = eskiSayi.toDouble() / yeniSayi.toDouble()
            }
        }
        hesaplama.setText(sonuc.toString())
        yeniOperator = true
    }
    fun temizle(view: View){
        var hesaplama = findViewById<TextView>(R.id.hesaplama)
        hesaplama.setText("0")
     yeniOperator = true


    }

}