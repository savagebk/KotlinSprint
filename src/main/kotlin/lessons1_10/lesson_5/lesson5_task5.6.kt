package org.example.lessons1_10.lesson_5

import kotlin.math.roundToInt

const val MIN_BMI = 18.5f
const val NORMAL_BMI = 25.0f
const val MAX_BMI = 30.0f
const val CM_IN_M = 100             //сантиметров в метре

fun main() {

    println("Расчет индекса массы тела")
    print("Введите ваш рост в сантиметрах: ")
    val height = (readln().toFloat()) / CM_IN_M
    print("Введите вашу массу в килограммах: ")
    val weight = readln().toFloat()

    val bmi: Float = weight / (height * height)
    print("Индекс массы тела равен ${(bmi*100).roundToInt()/100.0} - ")

    when {
        bmi < MIN_BMI -> println("недостаточная масса тела.")
        bmi >= MIN_BMI && bmi < NORMAL_BMI -> println("нормальная масса тела.")
        bmi >= NORMAL_BMI && bmi < MAX_BMI -> println("избыточная масса тела.")
    else -> println("ожирение.")
        }
}