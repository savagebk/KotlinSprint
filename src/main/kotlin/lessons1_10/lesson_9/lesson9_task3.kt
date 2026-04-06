package org.example.lessons1_10.lesson_9

fun main() {

    val quantity = listOf(2, 50, 15)
    println("Какое количество порций необходимо: ")
    val portions = readln().toInt()
    val totalQty = quantity.map { it * 2 }
    println("На $portions порций вам понадобится: Яиц – ${totalQty[0]}, молока – ${totalQty[1]}, сливочного масла – ${totalQty[2]}")
}