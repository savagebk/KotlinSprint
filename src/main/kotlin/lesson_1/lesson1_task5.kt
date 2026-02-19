package org.example.lesson_1

const val SECONDS_IN_HOUR = 3600                                                                    //секунд в часу
const val SECONDS_IN_MINUTE = 60                                                                    //секунд в минуте

fun main() {

    val totalSeconds = 6480                                                                         //количество секунд, которое Гагарин провел в космосе

    val hours = (totalSeconds / SECONDS_IN_HOUR)                                                    //количество целых часов, которое Гагарин провел в космосе
    val minutes = ((totalSeconds % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE)                            //количество целых минут вдобавок к часам, которое Гагарин провел в космосе
    val seconds = (((totalSeconds % SECONDS_IN_HOUR) % SECONDS_IN_MINUTE) % SECONDS_IN_MINUTE)      //количество секунд вдобавок к часам и минутам, которое Гагарин провел в космосе

        //вывод времени, проведенного в космосе Гагариным в одну строку с конвертированием в String и добавлением лидирующих нолей для приведения к формату hh:mm:ss
    println("Время, проведенное в космосе Гагариным - " + "%02d:%02d:%02d".format(hours, minutes, seconds))

}