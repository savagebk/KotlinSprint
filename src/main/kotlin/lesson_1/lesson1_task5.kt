package org.example.lesson_1

fun main() {

    val totalSeconds = 6480                                                         //количество секунд, которое Гагарин провел в космосе
    val secInHour = 3600                                                            //секунд в часу
    val secInMinute = 60                                                            //секунд в минуте
    val hours = (totalSeconds / secInHour)                                          //количество целых часов, которое Гагарин провел в космосе
    val minutes = ((totalSeconds % secInHour) / secInMinute)                        //количество целых минут вдобавок к часам, которое Гагарин провел в космосе
    val seconds = (((totalSeconds % secInHour) % secInMinute) % secInMinute)        //количество секунд вдобавок к часам и минутам, которое Гагарин провел в космосе

    //форматирование времени в формат hh:mm:ss
    val formattedHours = String.format("%02d", hours)
    val formattedMinutes = String.format("%02d", minutes)
    val formattedSeconds = String.format("%02d", seconds)

    //вывод времени, проведенного в космосе Гагариным в одну строку с конвертированием в String и добавлением лидирующих нолей для приведения к формату hh:mm:ss
    print("Время, проведенное в космосе Гагариным - ")
    print(formattedHours)
    print(":")
    print(formattedMinutes)
    print(":")
    println(formattedSeconds)
}