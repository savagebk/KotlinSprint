package org.example.lesson_7

fun main() {

    var code = (1000 .. 9999).random()
    println("Ваш код авторизации: $code")
    println("Введите код: ")
    while (readln() != code.toString()) {
        code = (1000 .. 9999).random()
        println("Ваш код авторизации: $code")
        println("Введите код: ")
    }
}