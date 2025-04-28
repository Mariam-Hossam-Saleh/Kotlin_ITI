package com.example.day2

class Triangle(height : Double , tBase : Double) : GeoShape(height) {
    var base : Double  = tBase
        set(value){
            if(value < 0.0){
                field = 0.0
            }
            else{
                field = value
            }
        }
    constructor():this(0.0)
    constructor(tHeight : Double):this(tHeight,tHeight)
    override fun calcArea(): Double {
        return dim * base * 0.5
    }
}