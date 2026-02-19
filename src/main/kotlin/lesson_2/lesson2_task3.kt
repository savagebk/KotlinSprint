package org.example.lesson_2

const val MINUTES_IN_HOUR = 60                                                                      //минут в часу

fun main() {
    val startHour = 9                                                                               //час отправления поезда
    val startMinute = 39                                                                            //минуты отправления поезда
    val duration = 457                                                                              //время в пути, минут

    var overallStartMinutes = startHour * MINUTES_IN_HOUR + startMinute                             //время отправления в минутах, прошедших после полуночи текущих суток
    var finishOverallMinutes = overallStartMinutes + duration                                       //время прибытия в минутах, прошедших после полуночи текущих суток

    var finishHours = finishOverallMinutes / MINUTES_IN_HOUR                                        //час прибытия
    var finishMinutes = finishOverallMinutes % MINUTES_IN_HOUR                                      //минуты прибытия

    println("Время прибытия поезда - " + "%02d:%02d".format(finishHours, finishMinutes))    //вывод времени прибытия поезда в формате hh:mm

}