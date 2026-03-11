package org.example.lesson_7

fun main() {

    println("Сколько секунд засечь?")
    val secs = readln().toInt()
    for (i in secs downTo 1) {
        println ("Осталось  ${i} секунд")
        Thread.sleep(1000)
    }
    println("Время вышло")

}