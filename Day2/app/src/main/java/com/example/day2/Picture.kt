package com.example.day2


fun sumArea(shape1 : GeoShape, shape2 : GeoShape, shape3 : GeoShape) : Double{
    return shape1.calcArea() + shape2.calcArea() + shape3.calcArea()
}

fun main(){
    var circle = Circle(2.0)
    println(circle.calcArea())
    var triangle = Triangle(4.0,6.0)
    println(triangle.calcArea())
    var rectangle = Rectangle(8.0)
    println(rectangle.calcArea())
    print(sumArea(circle,triangle,rectangle))

}