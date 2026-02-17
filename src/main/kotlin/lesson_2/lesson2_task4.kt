package org.example.lesson_2

fun main() {

    val baseChrystalOre = 7
    val baseIronOre = 11
    val buffPercent = 0.2                                                       //бафф 20%

    var bonusChrystalOre = (baseChrystalOre * buffPercent).toInt()              //расчет количества бонусной кристаллической руды и отбрасывание дробной части
    var bonusIronOre = (baseIronOre * buffPercent).toInt()                      //расчет количества бонусной железной руды и отбрасывание дробной части

    println()
    println("Бонусная кристаллическая руда: $bonusChrystalOre")
    println("Бонусная железная руда: $bonusIronOre")
}