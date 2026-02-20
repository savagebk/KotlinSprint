package org.example.lesson_3

fun main() {

    val helloDay = "Приветствую"
    val helloEvening = "Добрый вечер"
    var userName = "Алексей"

    var helloText = "$helloDay, $userName!"
    println(helloText)

    helloText = "$helloEvening, $userName!"
    println(helloText)
}