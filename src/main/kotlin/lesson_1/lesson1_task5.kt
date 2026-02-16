package org.example.lesson_1

fun main() {

    val totalSeconds: Short = 6480                                                  //количество секунд, которое Гагарин провел в космосе
    val hours: Byte = (totalSeconds / 3600).toByte()                                //количество целых часов, которое Гагарин провел в космосе
    val minutes: Byte = ((totalSeconds % 3600) / 60).toByte()                       //количество минут вдобавок к часам, которое Гагарин провел в космосе
    val seconds: Byte = (((totalSeconds % 3600) % 60) % 60).toByte()                //количество секунд вдобавок к часам и минутам, которое Гагарин провел в космосе

    //вывод времени, проведенного в космосе Гагариным в одну строку с конвертированием в String и добавлением лидирующих нолей для приведения к формату hh:mm:ss
    print("Время, проведенное в космосе Гагариным - ")
    print(hours.toString().padStart(2, '0'))
    print(":")
    print(minutes.toString().padStart(2, '0'))
    print(":")
    println(seconds.toString().padStart(2, '0'))
}