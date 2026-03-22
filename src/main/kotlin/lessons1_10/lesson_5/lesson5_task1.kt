package org.example.lessons1_10.lesson_5

import kotlin.random.Random

fun main() {

    val number1 = Random.nextInt(0, 9)
    val number2 = Random.nextInt(0, 9)

    println("Здравствуйте!")
    print("Для подтверждения того, что вы человек, введите результат выражения: $number1 + $number2 = ")

    val userIsHuman = (number1 + number2) == readln().toInt()

    if (userIsHuman) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }

}