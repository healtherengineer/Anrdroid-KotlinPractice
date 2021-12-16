package com.egebarisan.kotlinTutorials

import java.util.*

fun main(){

    var a :Int = 12
    println("I created a new kotlin file :) , my number is ${a}")

    print("Please enter your email : ")

    val input = Scanner(System.`in`)
    var email = input.next()

    print("Please enter your phone : ")
    var phone = input.next()
    println("Your mail = $email")
    println("Your phone = $phone")


    val start = 10
    val stop = 20
    val step = 5

    for ( x in start..stop step step){
        println(x)

    }


}