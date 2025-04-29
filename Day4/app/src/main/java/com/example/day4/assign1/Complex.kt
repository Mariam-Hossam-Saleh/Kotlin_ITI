package com.example.day4.assign1

class Complex(var real:Int = 0, var img:Int = 0) {
    constructor():this(0,0)
    constructor(value:Int):this(value,value)
    infix operator fun plus(complex: Complex):Complex{
        return Complex(this.real + complex.real , this.img + complex.img)
    }
    infix operator fun minus(complex: Complex):Complex{
        return Complex(this.real - complex.real , this.img - complex.img)
    }
}

fun Complex.printComplex() = println("${this.real} + ${this.img} j")

fun main(){
    val c1 : Complex = Complex(4)
    val c2 : Complex = Complex(img = 9, real = 7)
    val c3 : Complex = c1 + c2
    val c4 : Complex = c1 - c2
    c3.printComplex()
    c4.printComplex()


}