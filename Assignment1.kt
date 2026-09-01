package com.pes.assignment1

fun main() {

    val data = "Hi! How are you?"

    // 1. How many vowels are in the string
    var vowelCount = 0

    for (character in data.lowercase()) {
        if (
            character == 'a' ||
            character == 'e' ||
            character == 'i' ||
            character == 'o' ||
            character == 'u'
        ) {
            vowelCount++
        }
    }

    println("Number of vowels: $vowelCount")


    // 2. How many spaces
    var spaceCount = 0

    for (character in data) {
        if (character == ' ') {
            spaceCount++
        }
    }

    println("Number of spaces: $spaceCount")


    // 3. Use of when as an expression
    val message = when {
        vowelCount > 0 -> "The string contains vowels"
        else -> "The string does not contain vowels"
    }

    println(message)
}