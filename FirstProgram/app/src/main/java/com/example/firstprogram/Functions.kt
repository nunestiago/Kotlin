package com.example.firstprogram

fun main(args: Array<String>) {
    println("First number")
    var x:Int = readLine()!!.toInt()
    println("Second number")

    var y:Int = readLine()!!.toInt()

    var a:Int = summ(x,y)
    println("Soma é $a")
    var b:Int = findMinimumNumber(x,y)
    println("Maior número é $b")
}

fun summ (x: Int, y: Int): Int {
    return (x+y)
}

fun findMinimumNumber(x:Int, y:Int):Int {
    var min:Int
    if(x>y)min = x
    else min = y
    return min
}