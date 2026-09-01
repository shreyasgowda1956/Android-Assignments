package com.pes.lib

// Functional programming, collections
fun main() {

    val phoneNumbers = listOf("1234567890", "123", "", "0987654321")

    // 1. Using lambda, filter valid phone numbers - 10 digits
    val validPhoneNumbers = phoneNumbers.filter { phoneNumber ->
        phoneNumber.length == 10
    }

    println("Valid phone numbers:")
    println(validPhoneNumbers)


    // 2. Using lambda, print all phone numbers.
    // If invalid, print 'NAN'
    val updatedPhoneNumbers = phoneNumbers.map { phoneNumber ->
        if (phoneNumber.length == 10) phoneNumber else "NAN"
    }

    println("\nAll phone numbers:")
    updatedPhoneNumbers.forEach { phoneNumber ->
        println(phoneNumber)
    }
}