package com.example.firstprogram

fun main() {
    var age = arrayOf(1,2,3)
    for (i in age.indices) println(age[i])
    age[1] = 10
    for (i in age.indices) println(age.get(i))
}