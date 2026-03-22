package org.example.lessons1_10.lesson_6

fun main() {

    println("Сколько секунд засечь?")
    var secondsLeft = readln().toInt()

    while (secondsLeft > 0) {
        println("Осталось секунд: ${secondsLeft--}")
        Thread.sleep(1000)
    }
    println("Время вышло")
}