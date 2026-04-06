package org.example.lessons1_10.lesson_10

const val numbers = "0123456789"
const val symbols = " !\"#$%&'()*+,-./"

fun main() {

    print("Введите длину пароля: ")
    val passwordLength = readln().toInt()
    println("Ваш пароль: " + generate(passwordLength))
}

fun generate(length: Int): String {
    val password = MutableList(length) { ' ' }
    for (i in password.indices) {
        if (i % 2 == 0) {
            password[i] = numbers.random()
        } else {
            password[i] = symbols.random()
        }
    }
    return password.joinToString("")
}