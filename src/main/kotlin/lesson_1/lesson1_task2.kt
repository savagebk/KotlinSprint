package org.example.lesson_1

fun main() {
    var orderQuantity: Int = 75                         //количество заказов
    val thanksAlert: String = "Спасибо за покупку"      //текст благодарности за покупку
    var employeesCount: Int = 2000                    //количество работников

    //вывод в консоль значений количества заказов и содержимого благодарности за покупку
    println()
    print("Количество заказов - ")
    println(orderQuantity)
    print("Текст благодарности за покупку - ")
    println(thanksAlert)

    //вывод в консоль количества работников
    //print("Количество работников - ")
    //println(employeesCount)

    //количество работников изменяется
    employeesCount -= 1
    //вывод в консоль количества работников
    print("Количество работников - ")
    println(employeesCount)
}