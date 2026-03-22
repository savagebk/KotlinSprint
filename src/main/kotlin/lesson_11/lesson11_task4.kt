package lesson_11

import java.util.Date

class ReceiptCategory(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
    val receipts: MutableList<Receipt>,
)

class Receipt(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val portions: Int,
    val ingredients: MutableMap<Ingredient, Int>,
    val cookingMethod: MutableMap<Int, String>,
    val inFavorites: Boolean,
)

class Ingredient(
    val id: Int,
    val name: String,
    val measureUnit: String,
)