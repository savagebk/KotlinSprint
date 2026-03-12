package org.example.lesson_10

const val DICE_SIDES = 6
const val PLAYER_1 = "Пользователь"
const val PLAYER_2 = "Компьютер"
const val PL1_WIN_MSG = "Победило человечество"
const val PL2_WIN_MSG = "Победила машина"
const val EQUAL_RESULT_MSG = "Победила дружба"

fun main() {
    val player1result = turn(PLAYER_1)
    val player2result = turn(PLAYER_2)
    when {
        player1result > player2result -> println(PL1_WIN_MSG)
        player1result < player2result -> println(PL2_WIN_MSG)
        else -> println(EQUAL_RESULT_MSG)
    }
}

fun turn(name: String?): Int {
    val result = diceRoll(DICE_SIDES)
    println("Ходит $name. $name выбрасывает $result")
    return result
}

fun diceRoll(diceSides: Int?): Int {
    val roll = (1..(diceSides ?: 2)).random()
    return roll
}