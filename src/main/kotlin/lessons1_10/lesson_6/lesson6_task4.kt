package org.example.lessons1_10.lesson_6

const val MAX_TRIES = 5

fun main() {

    val number = (1..9).random()
    println("Угадай число от 1 до 9 за 5 попыток")
    var triesLeft = MAX_TRIES

    while (triesLeft-- > 0) {
        print("Введи число: ")
        if (readln().toInt() == number) {
            println("Это была великолепная игра!")
            return
        } else {
            if (triesLeft == 0) println("Было загадано число $number")
            else println("Неверно. Осталось попыток: ${triesLeft}")
        }
    }

}