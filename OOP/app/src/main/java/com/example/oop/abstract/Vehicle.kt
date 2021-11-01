package com.example.oop.abstract

abstract class Vehicle {

    // abstract function
    abstract fun vehicleName(name: String):String

    // non-abs fun
    fun vehicleType(type: String): String{
        return type
    }

    // abstract property
    abstract var model:Int

    // non-abs property
    var speed:Int? = null
}