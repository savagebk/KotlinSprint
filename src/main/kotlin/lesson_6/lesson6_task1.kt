package org.example.lesson_6

fun main() {

    print("Задайте имя пользователя: ")
    val userName = readln()
    print("Задайте пароль: ")
    val password = readln()

    do {
        println()
        print("Для авторизации введите имя пользователя: ")
        val userNameInput = readln()
        print("Введите пароль: ")
        val passwordInput = readln()
    } while (userNameInput != userName || passwordInput != password)

    println("Авторизация прошла успешно")
}