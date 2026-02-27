package org.example.lesson_6

fun main() {

    print("Задайте имя пользователя: ")
    val userName = readLine()
    print("Задайте пароль: ")
    val password = readLine()

    do {
        println()
        print("Для авторизации введите имя пользователя: ")
        var userNameInput = readLine()
        print("Введите пароль: ")
        val passwordInput = readLine()
        if (userNameInput != userName || passwordInput != password) println("Учетные данные неверны. Ввведите их заново")
    } while (userNameInput != userName || passwordInput != password)

    println("Авторизация прошла успешно")
}