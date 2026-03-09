package org.example.lesson_9

fun main() {

    println("Введите 5 ингредиентов через запятую с пробелом")
    val ingredients = readln().split(", ")
    val sortedIngredients = ingredients.sorted()
    println(sortedIngredients)

}