package org.example.lesson_4

const val NEED_SUNNY_WEATHER : Boolean = true
const val NEED_OPEN_AWNING : Boolean = true
const val NEED_HUMIDITY = 20                       //%
const val NO_NEED_TIME_OF_YEAR = "зима"

fun main() {

    var sunnyWeather : Boolean = true
    var openAwning : Boolean = true
    var humidity = 20
    var timeOfYear = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${(sunnyWeather && NEED_SUNNY_WEATHER) && (openAwning && NEED_OPEN_AWNING) && (humidity == NEED_HUMIDITY) && (timeOfYear != NO_NEED_TIME_OF_YEAR)}")

}