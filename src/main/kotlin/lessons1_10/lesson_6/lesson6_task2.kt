package org.example.lessons1_10.lesson_6

const val MILLIS = 1000                 // мс в секунде

fun main() {

    println("Сколько секунд засечь?")
    val secs = readln().toLong()
    val milliseconds = MILLIS * secs
    Thread.sleep(milliseconds)
    println("Прошло $secs секунд")

}