package org.example.lesson_2

fun main() {

    val baseChrystalOre = 7
    val baseIronOre = 11
    val buffPercent = 20f                                                       //бафф, %
    var buffPercent_100 = buffPercent / 100
    var bonusChrystalOre = (baseChrystalOre * buffPercent_100).toInt()              //расчет количества бонусной кристаллической руды и отбрасывание дробной части
    var bonusIronOre = (baseIronOre * buffPercent_100).toInt()                      //расчет количества бонусной железной руды и отбрасывание дробной части

    println()
    println("Бонусная кристаллическая руда: $bonusChrystalOre")
    println("Бонусная железная руда: $bonusIronOre")
}