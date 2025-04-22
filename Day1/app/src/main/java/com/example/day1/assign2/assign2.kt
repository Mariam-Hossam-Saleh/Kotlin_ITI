package com.example.day1.assign2

import kotlin.random.Random

fun main(){
//    val randomArr = arrayOfNulls<Int>(100)
    val randomArr = IntArray(100)
    for (index in 0 until 100){
        randomArr[index]=Random.nextInt(0,100)
        if(randomArr[index] <= 10)
            println(randomArr[index])

    }

}