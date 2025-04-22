package com.example.day1.assign5

fun main(){
    println("Enter your first name:")
    val firstName = readlnOrNull()
    println("Enter your second name:")
    val secondName = readlnOrNull()
    if(firstName == null){
        println(secondName)
    }
    else if(secondName == null){
        println(firstName)
    }
    else{
        println("$firstName $secondName")
    }

}