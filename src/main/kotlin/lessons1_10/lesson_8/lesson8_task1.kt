package org.example.lessons1_10.lesson_8

fun main() {

    val mon = 25
    val tue = 35
    val wed = 33
    val thu = 28
    val fri = 41
    val sat = 2
    val sun = 10

    val views = intArrayOf(mon, tue, wed, thu, fri, sat, sun)
    println("Всего просмотров за неделю: ${views.sum()}")

}