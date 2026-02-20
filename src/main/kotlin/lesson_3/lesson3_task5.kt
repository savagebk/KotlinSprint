package org.example.lesson_3

fun main() {

    var currentMoveData = "D2-D4;0"

    var from = currentMoveData.substring(0..1)
    var to = currentMoveData.substring(3..4)
    var move = currentMoveData.substring(6..6)

    println ("Начальное положение фигуры: $from")
    println("Конечное положение фигуры: $to")
    println("Номер хода: $move")

}