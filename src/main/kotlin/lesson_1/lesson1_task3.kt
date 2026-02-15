package org.example.lesson_1

fun main() {
    // год и время первого взлета Ю. Гагарина в космос
    val  year: Short = 1961         //год не изменяется
    var hour: Byte = 9              //час изменимо
    var minute: Byte = 7            //минуты изменимо

    //вывод в консоль года и времени взлета
    println()
    print ("Год полета - ")
    println(year)
    print("Час взлета - ")
    println(hour)
    print("Минуты взлета - ")
    println(minute)

    //изменение времени на время посадки
    hour = 10
    minute = 55

    //вывод времени посадки в одной строке
    println()
    print("Время посадки - ")
    print(hour)
    print(":")
    println(minute)
}