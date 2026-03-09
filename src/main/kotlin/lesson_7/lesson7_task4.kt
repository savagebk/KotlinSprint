package org.example.lesson_7

fun main() {

    println("Сколько секунд засечь?")
    val secs = readln().toInt()
    for (i in 0..secs - 1) {
        println ("Осталось  ${secs - i} секунд")
        Thread.sleep(1000)
    }
    println("Время вышло")

}