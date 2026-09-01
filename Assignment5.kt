package com.pes.lib

// Add exception handling
fun getNumber(data: String): Int {

    return try {
        data.toInt()
    } catch (e: NumberFormatException) {
        println("Invalid number: $data")
        0
    }
}

fun main() {

    println(getNumber("12"))    // String with only digits
    println(getNumber("a1as"))  // Invalid string
}