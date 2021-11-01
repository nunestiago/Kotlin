package com.example.firstprogram

fun main(args: Array<String>) {
    print("Please enter your age: ")
    var yourAge:Int = readLine()!!.toInt()
    if(yourAge < 13) print("Kid")
    else if (yourAge < 19) print("Teenager")
    else print("Adult")
}