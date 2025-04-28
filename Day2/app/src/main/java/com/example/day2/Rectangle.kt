package com.example.day2

class Rectangle(width : Double, h : Double) : GeoShape(width) {
    var height : Double = h
        set(value){
            if(value < 0.0){
                field = 0.0
            }
            else{
                field = value
            }
        }
    constructor() : this(0.0,0.0)
    constructor(rHeight : Double) : this(rHeight,rHeight)
    override fun calcArea(): Double {
        return dim * height
    }
}