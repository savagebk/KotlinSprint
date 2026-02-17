package org.example.lesson_2

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {

    val startAmount = BigDecimal(70000)                                                                                     //сумма вклада, рублей
    val interestRate = BigDecimal(16.7)                                                                                     //процентная ставка, %
    val depositeTerm = 20                                                                                                        //срок вклада
    val amountRoundDigits = 3                                                                                                    //количество знаков после запятой в сумме на счете
    val interestRate_100 = interestRate.divide(BigDecimal(100))                                                    //перевод процентной ставки в коэффициент

    var base = interestRate_100.add(BigDecimal(1))                                                                          //основание степени формулы сложных процентов с ежегодной капитализацией
    var raised = base.pow(depositeTerm)                                                                                      //возведение в степень
    var endAmount = startAmount.multiply(raised, )                                                                   //вычисление суммы на счету в конце срока вклада

    var shownEndAmount = endAmount.setScale(amountRoundDigits, RoundingMode.HALF_UP)                                   //округление отображаемой суммы на счету в конце срока вклада

    println("Размер вклада через $depositeTerm лет: $shownEndAmount р.")
}