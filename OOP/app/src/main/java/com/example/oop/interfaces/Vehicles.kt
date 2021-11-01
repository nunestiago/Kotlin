package com.example.oop.interfaces

class Vehicles: CanGo, CanStop {
    override val name: String
        get() = "Ferrari"

    override fun stop() {
        println("Vehicle can stop")
    }
}