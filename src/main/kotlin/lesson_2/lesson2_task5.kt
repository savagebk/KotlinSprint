package org.example.lesson_2

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {

    val startAmount = BigDecimal(70000)
    val interestRate = BigDecimal(16.7)
    val depositeTerm = 20
    val amountRoundDigits = 3

    val interestRate_100 = interestRate.divide(BigDecimal(100))

    // вычисление суммы на счету с учетом сложных процентов с ежегодной капитализацией
    var base = interestRate_100.add(BigDecimal(1))
    var raised = base.pow(depositeTerm)
    var endAmount = startAmount.multiply(raised, )

    var shownEndAmount = endAmount.setScale(amountRoundDigits, RoundingMode.HALF_UP)

    println("Размер вклада через $depositeTerm лет: $shownEndAmount р.")
}
/*import kotlin.math.pow
import kotlin.math.round


fun main(){

    val startAmount = 70000
    val interestRate = 16.7f
    val depositeTerm = 20
    val amountRoundDigits = 3

    val interestRate_100 = round((interestRate / 100)*1000)/1000

    println(interestRate_100)

    // вычисление суммы на счету с учетом сложных процентов с ежегодной капитализацией
    var base = interestRate_100+1
    var raised = base.pow(depositeTerm) ; println(raised)
    var endAmount = startAmount * raised

    var shownEndAmount = round(endAmount*1000)/1000

    println("Размер вклада через $depositeTerm лет: $shownEndAmount р.")
}*/