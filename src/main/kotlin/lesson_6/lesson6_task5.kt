package org.example.lesson_6

import kotlin.random.Random

const val MAX_TRIES_OF_LOGIN = 3

fun main() {

    var number1: Int
    var number2: Int
    var triesLeft = MAX_TRIES_OF_LOGIN

    println("Здравствуйте!")
    println("Для подтверждения того, что вы человек, введите результат выражения:")

    while (triesLeft-- > 0) {
        number1 = Random.nextInt(1, 9)
        number2 = Random.nextInt(1, 9)
        print("$number1 + $number2 = ")
        if ((number1 + number2) == readln().toInt()) {
            println("Добро пожаловать!")
            break
        } else {
            if (triesLeft == 0) {
                println("Доступ запрещен")
            } else {
                println("Неверно. Попробуйте еще раз.")
            }
        }
    }

}