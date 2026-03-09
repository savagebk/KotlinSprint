package org.example.lesson_7

const val MIN_PASSWORD_LENGTH = 6

fun main() {

    print("Введите длину пароля (минимум 6 символов): ")
    var passwordLenght = readln().toInt()
    if (passwordLenght < MIN_PASSWORD_LENGTH) {
        passwordLenght = 6
        println("Длина пароля увеличена до $MIN_PASSWORD_LENGTH символов")
    }
    val symbols = (0..9).toList() + ('a'..'z').toList() + ('A'..'Z').toList()
    var password = ""

    for (i in 1 .. passwordLenght) {
        password = password + symbols.random()
    }

    println("Ваш пароль: " + password)
}