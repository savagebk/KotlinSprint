package org.example.lessons1_10.lesson_5

import kotlin.math.roundToInt

const val RATIONED_DISTANCE = 100

fun main() {

    print("Введите расстояние поездки (в километрах): ")
    val distance = readln().toFloat()
    print("Введите расход топлива на $RATIONED_DISTANCE км (в литрах): ")
    val consumtion = readln().toFloat()
    print("Введите текущую цену за литр топлива: ")
    val price = readln().toFloat()

    val gasVolume : Float = consumtion * distance / RATIONED_DISTANCE
    val gasValue : Float = gasVolume * price

    println("Общее количество необходимого топлива ${(gasVolume*100).roundToInt()/100f} л.")
    println("Стоимость поездки ${(gasValue*100).roundToInt()/100f}")
}