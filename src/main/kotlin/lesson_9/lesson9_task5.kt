package org.example.lesson_9

const val NUMBER_OF_INGREDIENTS = 5

fun main() {

    val list = mutableSetOf<String>()
    println("Введите $NUMBER_OF_INGREDIENTS названий ингредиентов, каждый в новой строке.")

    for (i in 0 .. (NUMBER_OF_INGREDIENTS - 1))  {
        print("Введите название ингредиента №${i + 1}: ")
        list.add(readln())
    }

    println(list.sorted().toString().drop(1).dropLast(1).replaceFirstChar { it.uppercase() })
}