package org.example.lessons1_10.lesson_5

fun main() {

    var number1 = "28"
    var number2 = "42"

    var numberOfGuessed = 0

    print("Введите первое число: ")
    val input1 = readln()
    print("Введите второе число: ")
    val input2 = readln()

    if (input1 == number1 || input1 == number2) numberOfGuessed++
    if ((input2 == number1 || input2 == number2) && input2 != input1) numberOfGuessed++

    when (numberOfGuessed) {
        0 -> println("Неудача!")
        1 -> println("Вы выиграли утешительный приз")
        2 -> println("Поздравляем! Вы выиграли главный приз!")
    }
}