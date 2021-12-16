package com.example.lab1

import java.util.*

class loop {
    fun main() {
        var baslangıc = 10;
        var bitis = 20 ;
        var artis = 2 ;
        for (a in baslangıc..bitis step artis){
            println(a)
        }
        println("Sil  : 1 ");
        println("Sil  : 2 ");
        var input = Scanner(System.`in`)
        val choice = input.nextInt();
        when(choice){
            1 -> println("Veri eklendi")
            2 -> println("Veri silindi")

         }
    }
}