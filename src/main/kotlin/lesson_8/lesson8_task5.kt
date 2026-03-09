package org.example.lesson_8

fun main() {
    print("Введите количество ингредиентов: ")
    val quantity = readln().toInt()
    val ingredients = arrayOfNulls<String>(quantity)
    println("Введите ингредиенты по одному в каждой строке.")

    for (i in ingredients.indices) {
        print("Введите ингредиент №${i + 1}: ")
        ingredients[i] = readln().lowercase()
    }

    println("Готово! Вы сохранили следующий список: ${ingredients.contentToString().drop(1).dropLast(1)}")
}