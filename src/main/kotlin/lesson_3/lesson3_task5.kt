package org.example.lesson_3

fun main() {

    var currentMoveData = "D2-D4;0"
    var splitted = currentMoveData.split('-', ';')

    var from = splitted [0]
    var to = splitted [1]
    var move = splitted [2]

    println ("Начальное положение фигуры: $from")
    println("Конечное положение фигуры: $to")
    println("Номер хода: $move")

}