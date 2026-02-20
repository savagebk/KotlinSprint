package org.example.lesson_3

fun main() {

    var fromColumn = "E"
    var fromRow = 2
    var toColumn = "E"
    var toRow = 4
    var move = 1

    println ("${fromColumn + fromRow}-${toColumn + toRow};$move")

    move = move + 2
    fromColumn = "D"
    fromRow = 2
    var distance = 1
    toColumn = "D"
    toRow = fromRow + distance

    println ("${fromColumn + fromRow}-${toColumn + toRow};$move")
}