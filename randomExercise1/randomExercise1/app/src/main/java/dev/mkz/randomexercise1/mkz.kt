package dev.mkz.randomexercise1

import java.util.*

fun main(){


    val sc = Scanner(System.`in`)

    var arr = Array<String>(5){""}

    for (i in 0 until arr.size){
        print("Enter ${i+1}.name : ")
        arr[i] = sc.nextLine()
    }

    for ((index,element) in arr.withIndex()){
        println("${index + 1}.Element is $element")
    }

}

