package org.example.lesson_3

fun main() {

    val helloDay = "Приветствую"                                        //текст дневного приветствия
    val helloEvening = "Добрый вечер"                                   //текст вечернего приветствия
    var userName = "Алексей"                                            //имя пользователя

    var helloText = "$helloDay, $userName!"
    println(helloText)

    helloText = "$helloEvening, $userName!"
    println(helloText)
}