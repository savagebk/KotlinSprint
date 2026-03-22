package org.example.lessons1_10.lesson_8

fun main() {

    val ingredients = arrayOf("пельмени", "вода", "соль")
    print("Какой ингредиент найти: ")
    val askedIngredient = readln().lowercase()

    if (ingredients.contains(askedIngredient)) {
        println("Ингредиент \"$askedIngredient\" в рецепте есть")
        return
        }

    println("Такого ингредиента в рецепте нет")
}