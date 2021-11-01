package com.example.oop.interfaces

interface CanGo {
    fun go(){
        println("Vehicle can go")
    }

    val name: String
        get() = "Ferrari"
}