package org.example.lesson_10

const val MIN_LENGTH = 4

fun main() {
    println("Задайте логин и пароль (минимум 4 символа)")
    print("Введите логин: ")
    val login = readln()
    print("Введите пароль: ")
    val password = readln()

    if (lengthCheck(login) && lengthCheck(password)) {
        println("Логин и пароль приняты")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun lengthCheck(input: String): Boolean {
    if (input.length >= MIN_LENGTH) {
        return true
    } else {
        return false
    }
}