package org.example.lessons1_10.lesson_9

fun main() {
    val ingredients = listOf("огурцы", "помидоры", "лук", "сыр \"фета\"", "оливковое масло")
    println("В рецепте есть следующие ингредиенты:")
    ingredients.forEach { println(" - $it") }
}