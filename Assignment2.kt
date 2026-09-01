package com.pes.assignment1

fun convert(names: Array<String?>) {

    println("Using explicit null check:")

    // Explicit null check
    for (name in names) {
        if (name != null) {
            println(name.uppercase())
        } else {
            println("Name is null")
        }
    }


    println("\nUsing safe call operator:")

    // Safe call operator
    for (name in names) {
        println(name?.uppercase())
    }


    println("\nUsing Elvis operator:")

    // Elvis operator
    for (name in names) {
        val result = name?.uppercase() ?: "UNKNOWN"
        println(result)
    }


    println("\nUsing assertion operator:")

    // Assertion operator
    for (name in names) {
        try {
            println(name!!.uppercase())
        } catch (e: NullPointerException) {
            println("Cannot convert null using assertion operator")
        }
    }
}


fun main() {

    convert(arrayOf("john", null, "merry", "robert"))
}