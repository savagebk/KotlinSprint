package org.example.lesson_2

import kotlin.math.pow
import kotlin.math.round

fun main(){

    val startAmount = 70000
    val interestRate = 16.7
    val depositeTerm = 20

    val interestRate_100 = interestRate / 100

    // вычисление суммы на счету с учетом сложных процентов с ежегодной капитализацией
    var base = interestRate_100+1
    var raised = base.pow(depositeTerm)
    var endAmount = startAmount * raised

    var shownEndAmount = round(endAmount*1000)/1000

    println("Размер вклада через $depositeTerm лет: $shownEndAmount р.")
}