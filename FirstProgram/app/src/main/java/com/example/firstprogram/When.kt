package com.example.firstprogram

fun main(args: Array<String>) {
    print("Please enter your age: ")
    var yourAge:Int = readLine()!!.toInt()
    when {
        yourAge < 13 -> print("Kid")
        yourAge < 19 -> print("Teenager")
        else -> print("Adult")
    }
}