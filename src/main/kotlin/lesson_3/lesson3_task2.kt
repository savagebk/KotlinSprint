package org.example.lesson_3

fun main() {

    var age = 20
    var firstName = "Татьяна"
    var patronymic = "Сергеевна"
    var familyName = "Андреева"

    var ageAndFio = "Bозраст: " + age + ", ФИО: " + familyName + " " + firstName + " " + patronymic
    println (ageAndFio)

    age = 22
    familyName = "Сидорова"

    ageAndFio = "Bозраст: " + age + ", ФИО: " + familyName + " " + firstName + " " + patronymic
    println (ageAndFio)

}