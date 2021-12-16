package com.egebarisan.kotlinTutorials

//args :Array<String> it can be a parameter for main function according to past
// but now as You can see it is not required
/*
This is used for adding multiline comments
 */
fun main() {

    println("My message should display on terminal")
    println("Hellooo Kotlin")

    //Variables
    //if you use var you can change value of the variable.
    //for example

    var a = 5
    var name = "Ege"

    println(a)
    a = 15;
    println(a)
    println(name)
    //if you wanna declare type of the variables
    // var alyans :VariableType(String,Int,boolean...) = value
    //Very very important
    var n1: Int = 12
    var birth_Date: String = "1923"

    println(birth_Date + n1)
    println(n1.toString() + birth_Date.toInt())

    //use of val
    //We use val keyword for constant variables
    val birth_year: String = "2000"
    println("Your birth date is constant and unchangeable ,Your birth date is " + birth_year)
    //birth_year ="1923" if I try this I get val type is not ressigned error
    var isKotlinFun: Boolean = false
    if (isKotlinFun) {
        println("You are gonna be perfect mobil programmer")

    } else if (2.toString() == "2") {
        println("it ends here")
    } else {
        println("you , pass to Flutter :)")
    }
//Type Casting
    //To convert a numeric data type to another type, you must use one of the following functions:
    //  toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble() or toChar():
    var myNewName: String = "Ege"
    var myNewLastName: String = "Barışan"
    var birthDate: String = "26/04/2000"
    var myGano: Double = 3.55
    println("****************************************************")
    println("My new name is $myNewName")
    println("My new last name is $myNewLastName")
    println("My birth date is ${birthDate}")
    println("My current Gano is $myGano")

    //Example of Single line if .
    val time = 20
    val greeting = if (time < 18) "Have a Good day." else "Good evening."
    println(greeting)

    var range = 0
    while (range < 10){
        range++
        if (range == 4){
            continue
        }
        println(range)

    }

    //How to Create an array in Kotlin
    var courses:Array<String> = arrayOf("Operating Systems", "Networks",
        "Mobile Programming" , "Image Processing"  ,"Enterprising" , "Database Management System")
    var x:Int
    var y:Int
    for (x in 0 until courses.size){
        y=x+1
        println(y.toString()+ " " +courses[x])

    }
    var gender:Char  =' '
    var lName:String = "BARISAN"
    greetingWithGender(lName,gender)


}
fun greetingWithGender(lName:String , gender:Char){

    if(gender == 'M'){
        println("Hello Mr." + lName +" ,How Can I help you ? ")
    }
    else if (gender == 'F'){
        println("Hello Mrs." + lName +" ,How Can I help you ? ")
    }
    else
    {
        println("Hello Dear " + lName +" ,How Can I help you ? ")
    }
}