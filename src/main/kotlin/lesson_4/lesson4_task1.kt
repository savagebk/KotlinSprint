package org.example.lesson_4

const val TABLES_COUNT = 13

fun main() {

    var todayBookedTables = 13
    var tomorrowBookedTables = 9

    println("Доступность столиков на сегодня: ${todayBookedTables < TABLES_COUNT}")
    println("Доступность столиков на завтра: ${tomorrowBookedTables < TABLES_COUNT}")
}