package org.example.lessons1_10.lesson_10

const val CRED_USERNAME = "qwerty"
const val CRED_PASSWORD = "123456"
const val TOKEN_SIZE = 32

fun main() {
    print("Введите имя пользователя: ")
    val usernameInput = readln()
    print("Введите пароль: ")
    val passwordInput = readln()
    val token = authorizeAndGenerateToken(usernameInput, passwordInput)
    if (token != null) {
        println("В корзине: " + getBasket(token).joinToString(", "))
    } else {
        println("Неудачная авторизация")
    }
}

fun authorizeAndGenerateToken(username: String, password: String): String? {
    if (username == CRED_USERNAME && password == CRED_PASSWORD) {
        val symbols = (('0'..'9') + ('A'..'Z') + ('a'..'z'))
        val token = MutableList(TOKEN_SIZE) { '0' }
        for (i in 0 until TOKEN_SIZE) {
            token[i] = symbols[symbols.indices.random()]
        }
        return token.joinToString("")
    } else return null
}

fun getBasket(token: String): List<String> {
    val basket = listOf("Грецкие орехи", "Копченая колбаса", "Ежедневник")
    val tokenReceiver = token
    return basket
}