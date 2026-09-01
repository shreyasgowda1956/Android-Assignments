package com.pes.lib

// Parent class
open class BankAccount(
    val accName: String,
    val accNumber: Int
) {
    var balance: Int = 0

    open fun displayInfo() {
        println("Account Holder Name: $accName")
        println("Account Number: $accNumber")
        println("Balance: $balance")
    }
}


// Child class inherited from BankAccount
class SavingAccount(
    accName: String,
    accNumber: Int,
    val interestRate: Float
) : BankAccount(accName, accNumber) {

    // Add amount to balance
    fun credit(amount: Int) {
        balance += amount
    }

    // Subtract amount from balance
    fun debit(amount: Int) {
        balance -= amount
    }

    // Override displayInfo to also print interest rate
    override fun displayInfo() {
        super.displayInfo()
        println("Interest Rate: $interestRate")
    }
}


fun main() {

    // Create a SavingAccount object
    val account = SavingAccount(
        "Shreyas",
        123456,
        5.5f
    )

    // Add money
    account.credit(5000)

    // Subtract money
    account.debit(1000)

    // Display account information
    account.displayInfo()
}