package lesson_11

class RecipeCategory(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
    val recipes: List<Recipe>,
)

class Recipe(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val ingredients: List<Ingredient>,
    val cookingMethod: List<String>,
    val inFavorites: Boolean,
)

class Ingredient(
    val quantity: Int,
    val unitOfMeasure: String,
    val description: String,
)