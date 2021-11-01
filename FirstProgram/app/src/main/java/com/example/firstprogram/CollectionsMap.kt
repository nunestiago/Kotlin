package com.example.firstprogram

fun main(args: Array<String>) {

    // immutable
    var age = mapOf<String, Int>("David" to 20, "Test" to 25)
    println(age["David"])

    // mutable
    var mutAge = mutableMapOf<String, Int>("David" to 20, "Test" to 25)
    mutAge.put("Buff", 30)
}