package org.example.lesson_9

fun main() {

    val ingredients = mutableListOf("огурцы", "помидоры", "лук")
    println("В рецепте есть базовые ингредиенты: ${ingredients.toString().drop(1).dropLast(1)}")

    println("Желаете добавить еще?")
    if (readln().equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        ingredients.add(readln())
    } else return

    println("Теперь в рецепте есть следующие ингредиенты: ${ingredients.toString().drop(1).dropLast(1)}")
}