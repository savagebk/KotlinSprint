package org.example.lesson_5

import kotlin.random.Random

fun main() {

    val number1 = Random.nextInt(0, 42).toString()
    var number2 = Random.nextInt(0, 42).toString()
    while (number2 == number1) {
        number2 = Random.nextInt(0, 42).toString()
    }
    var number3 = Random.nextInt(0, 42).toString()
    while (number3 == number1 || number3 == number2) {
        number2 = Random.nextInt(0, 42).toString()
    }

    val numbers = listOf(number1, number2, number3)

    println("Введите числа по одному в каждой строке:")
    val input1 = readln()
    val input2 = readln()
    val input3 = readln()

    val inputs = listOf(input1, input2, input3)

    val guessed = (inputs intersect numbers).size

    when (guessed) {
        3 -> println("Вы угадали все числа и выиграли джек-пот!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число и получаете утешительный приз")
        0 -> println("Вы не угадали ни одного числа")
        }

    print("Выигрышные числа: $numbers")
}