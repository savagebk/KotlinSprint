package org.example.lesson2

fun main() {

    //marks of students
    val student_1_Mark = 3f
    val student_2_Mark = 4f
    val student_3_Mark = 3f
    val student_4_Mark = 5f

    var avgMark = (student_1_Mark + student_2_Mark + student_3_Mark + student_4_Mark)/4             //calculating of average mark
    var formattedAvgMark = String.format("%.2f", avgMark)

    print("Средний балл: ")
    println(formattedAvgMark)

}