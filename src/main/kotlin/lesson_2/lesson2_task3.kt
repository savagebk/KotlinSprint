package org.example.lesson_2

fun main() {
    val startHour = 9                                                                               //час отправления поезда
    val startMinute = 39                                                                            //минуты отправления поезда
    val duration = 457                                                                              //время в пути, минут

    val minutesInHour = 60                                                                          //минут в часу

    var overallStartMinutes = startHour * minutesInHour + startMinute                               //время отправления в минутах, прошедших после полуночи текущих суток
    var finishOverallMinutes = overallStartMinutes + duration                                       //время прибытия в минутах, прошедших после полуночи текущих суток

    var finishHours = finishOverallMinutes / minutesInHour                                          //час прибытия
    var finishMinutes = finishOverallMinutes % minutesInHour                                        //минуты прибытия

    //форматирование времени прибытия поезда в формат hh:mm
    var formattedFinishHour = String.format("%02d", finishHours)
    var formattedFinishMinutes = String.format("%02d", finishMinutes)

    //вывод времени прибытия поезда
    println()
    print("Время прибытия поезда - ")
    print(formattedFinishHour)
    print(":")
    println(formattedFinishMinutes)

}