package org.example.lesson_6

const val MILLIS = 1000                 // мс в секунде

fun main() {

    println("Сколько секунд засечь?")
    val milliseconds = MILLIS*readln().toLong()

    Thread.sleep(milliseconds)

}