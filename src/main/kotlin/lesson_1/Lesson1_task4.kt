package org.example.lesson_1

fun main() {
    val lenght = 40_868_600_000L                        //расстояние, которое пролетел Гагарин пока был в космосе в миллиметрах
    val age: Byte = 27                                  //возраст Гагарина на момент полета (целых лет)
    val partOfDay = 0.075f                              //какую часть дня Гагарин провел в космосе
    val seconds: Short = 6480                           //количество секунд которое Гагарин провел в космосе
    val partOfYear: Double = 2.0547945205479453E-4      //какую часть года Гагарин провел в космосе
    val apogee: Int = 327000                            //апогей орбиты Гагарина в метрах

    //вывод на печать значений
    println()
    print ("Расстояние, мм - "); println(lenght)
    print ("Возраст, полных лет – "); println(age)
    print ("Часть дня – "); println(partOfDay)
    print ("Секунды – "); println(seconds)
    print ("Часть года – "); print(partOfYear)
    print ("Апогей орбиты, м - "); println(apogee)
}
