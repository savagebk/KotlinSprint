package org.example.lesson_4

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100

fun main() {

    var weight1 = 20
    var volume1 = 80
    var weight2 = 50
    var volume2 = 100

    println("Груз с весом $weight1 кг и объемом $volume1 л соответствует категории 'Average': ${(weight1 > MIN_WEIGHT && weight1 <= MAX_WEIGHT) && volume1 < MAX_VOLUME}")
    println("Груз с весом $weight2 кг и объемом $volume2 л соответствует категории 'Average': ${(weight2 > MIN_WEIGHT && weight2 <= MAX_WEIGHT) && volume2 < MAX_VOLUME}")
}