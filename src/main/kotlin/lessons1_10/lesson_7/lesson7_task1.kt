package org.example.lessons1_10.lesson_7

const val PASSWORD_LENGHT = 6

fun main() {

    val symbols = (0..9).toList() + ('a'..'z').toList()
    var password = ""

    for (i in 1 .. PASSWORD_LENGHT) {
        password = password + symbols.random()
    }

    println(password)
}