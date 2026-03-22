package org.example.lessons1_10.lesson_8

fun main() {

    val ingredients = arrayOf("пельмени", "вода", "соль")
    print("Какой ингредиент найти: ")
    val askedIngredient = readln().lowercase()
    for (i in ingredients.indices) {
        if (ingredients[i] == askedIngredient) {
            println("Ингредиент \"$askedIngredient\" в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}