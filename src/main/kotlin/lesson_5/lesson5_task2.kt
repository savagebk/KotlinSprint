package org.example.lesson_5

import java.time.LocalDate

const val AGE_OF_MAJORITY = 18

fun main () {

    print("Введите год вашего рождения: ")
    val age = readln().toInt()
    val currentYear = LocalDate.now().getYear()
    if (currentYear - age >= AGE_OF_MAJORITY) println ("Показать экран со скрытым контентом")

}