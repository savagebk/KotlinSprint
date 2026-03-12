package org.example.lesson_8

fun main() {

    val ingredients = arrayOf("огурцы", "помидоры", "лук", "сыр \"фета\"", "оливковое масло")
    println("Ингредиенты: ${ingredients.contentToString().drop(1).dropLast(1)}")

    println("Какой ингредиент заменить: ")
    val changeIngr = readln().lowercase()
    val changeIndex = ingredients.indexOf(changeIngr)
    if (changeIndex != -1) {
        print("Заменить на: ")
        ingredients[changeIndex] = readln().lowercase()
        println("Готово! Вы сохранили следующий список: ${ingredients.contentToString().drop(1).dropLast(1)}")
    } else {
        println("Данного ингредиента нет в списке")
    }
}