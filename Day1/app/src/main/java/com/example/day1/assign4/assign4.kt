package com.example.day1.assign4

fun main(){
    val star = "*"
    val space = " "
    println("Enter size of the triangle:")
    val size = readlnOrNull()?.toIntOrNull() ?: 0
    for(i in 1..size){
        for (j in 0..size*2+1){
            if(j<i){
                print(star)
            }
            else if(j > size*2+1-i){
                print(star+space)
            }
            else{
                print(space)
            }
        }
        println()
    }

}