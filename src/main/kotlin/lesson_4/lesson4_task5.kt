package org.example.lesson_4

const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_PROVISIONS = 50

fun main() {

    var shipDamaged = true
    var weatherIsGood = false

    println ("Введите параметры полета")
    println()
    print ("Наличие повреждений корабля y/n: ")
    val shipDamagedString = readln()
    if (shipDamagedString == "n" ||
        shipDamagedString == "N" ||
        shipDamagedString == "н" ||
        shipDamagedString == "Н") {
        shipDamaged = false
    }

    print ("Число членов экипажа: ")
    val crew = readln().toInt()

    print("Количество ящиков провизии: ")
    val provisions = readln().toInt()

    print("Погодные условия благоприятны: ")
    val weatherString = readln().lowercase()
    if (weatherString == "y" || weatherString == "д") {
        weatherIsGood = true
    }

    val readyToShipOut = (shipDamaged == false &&
            (crew >= MIN_CREW && crew <= MAX_CREW) &&
            provisions > MIN_PROVISIONS) ||
                (crew == MAX_CREW &&
                weatherIsGood == true &&
                provisions >= MIN_PROVISIONS)

    println()
    if (readyToShipOut) {
        println("Корабль готов к отплытию")
    } else {
        println("Корабль НЕ готов к отплытию")
    }
}