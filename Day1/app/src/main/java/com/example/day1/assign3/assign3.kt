package com.example.day1.assign3

fun main(){
    val result : Int?
    println("Enter first number:")
    val num1 : Int = readlnOrNull()?.toIntOrNull() ?: 0
    println("Enter second number:")
    val num2 : Int = readlnOrNull()?.toIntOrNull() ?: 0
    println("Enter Operation ( + , - , * , /):")
    val operation : String = readlnOrNull().toString()
    when(operation){
        "+" -> result = num1 + num2
        "-" -> result = num1 - num2
        "*" -> result = num1 * num2
        "/" -> {
            if (num2 != 0){
                result = num1 / num2
            } else {
                println("Division by zero")
                result = null
            }
        }
        else -> {
            println("Wrong Operation")
            result = null
        }
    }
    if(result != null)
        println("Result:\n$result")
}