package com.example.firstprogram

fun main(args: Array<String>) {
    var age = ArrayList<Int>()
    age.add(10)
    age.add(1,20)
    age.add(30)
    println("${age[0]} ${age[1]} ${age[2]}")

    age.remove(20)
    age.size // 2

    var cars = arrayListOf<String>("Opel", "BMW")
}