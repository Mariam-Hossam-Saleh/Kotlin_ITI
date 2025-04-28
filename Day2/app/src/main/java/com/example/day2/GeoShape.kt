package com.example.day2

abstract class GeoShape(d: Double){
    var dim : Double = d
        set(value){
            if(value < 0.0){
                field = 0.0
            }
            else{
                field = value
            }
        }
    constructor():this(0.0)
    abstract fun calcArea() : Double
}