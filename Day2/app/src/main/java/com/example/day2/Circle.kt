package com.example.day2

class Circle(radious: Double) : GeoShape(radious) {
    constructor():this(0.0)
    override fun calcArea(): Double {
        return dim * dim * 3.14
    }
}