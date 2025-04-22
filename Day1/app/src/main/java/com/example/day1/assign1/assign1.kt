package com.example.day1.assign1

fun main(){
    println("Enter your name: ")
    val inputName : String? = readlnOrNull()
    if(inputName.isNullOrBlank()){
        println("Hello Anonymous!")
    }
    else{
        println("Hello $inputName")
    }
}