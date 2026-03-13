package org.example.lesson_10

const val DICE_SIDES = 6
const val PLAYER_1 = "Пользователь"
const val PLAYER_2 = "Компьютер"

fun main() {

    var player1result: Int
    var player2result: Int
    var player1wins = 0

    do {
        player1result = turn(PLAYER_1)
        player2result = turn(PLAYER_2)
        if (player1result > player2result) player1wins++
        print("Хотите бросить кости еще раз? Введите Да или Нет: ")
    } while (readln() == "Да")

    println("$PLAYER_1 выиграл $player1wins раз.")
}

fun turn(name: String): Int {
    val result = diceRoll(DICE_SIDES)
    println("Ходит $name. $name выбрасывает $result")
    return result
}

fun diceRoll(diceSides: Int): Int {
    val roll = (1..diceSides).random()
    return roll
}