package com.example.day3.assign1

data class Person(var name : String, var address : Address) {

    data class Address(var streetName: String, var city: String, var building: String)

//    override fun toString(): String {
//        return name
//    }
}

enum class building{
    VILLA,
    APARTMENT
}

fun main() {
    var person = Person("Mariam", Person.Address("street7","Cairo", building.VILLA.name))
    println(person)
}

