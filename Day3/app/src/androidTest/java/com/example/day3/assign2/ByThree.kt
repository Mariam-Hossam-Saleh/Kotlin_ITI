package com.example.day3.assign2

class ByThree : Number {
    override var start : Int = 0
        set(value){
            field = value
            current = value
        }
    override var current : Int = 0

    override fun reset() {
        current = start
    }

    override fun getNext(): Int {
        current += 3
        return current
    }

}

fun main() {
    var byThree = ByThree()
    var ref : Number
    for(x in 1..5){
        ref = byThree
        println("By Three: ${ref.getNext()}")
    }
}