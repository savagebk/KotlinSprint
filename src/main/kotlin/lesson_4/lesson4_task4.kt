package org.example.lesson_4

fun main () {

    val day = 5
    var isEven : Boolean = (day % 2) == 0
    println("""
Упражнения для рук:    ${!isEven}
Упражнения для ног:    $isEven
Упражнения для спины:  $isEven
Упражнения для пресса: ${!isEven}""")

}