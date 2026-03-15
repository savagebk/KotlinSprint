package org.example.lessons1_10.lesson_10

const val CRED_USERNAME = "qwerty"
const val CRED_PASSWORD = "123456"
const val TOKEN_SIZE = 32

fun main() {

    print("Введите имя пользователя: ")
    val usernameInput = readln()
    print("Введите пароль: ")
    val passwordInput = readln()
    val token = authorization(usernameInput, passwordInput)
    if (token != null) {
        println("В корзине: " + basket(token).joinToString(", "))
    } else {
        println("Неудачная авторизация")
    }
}

fun authorization(username: String, password: String): String? {
    if (username == CRED_USERNAME && password == CRED_PASSWORD) {
        val symbols = (('0'..'9') + ('A'..'Z') + ('a'..'z')).toString()
        val token = mutableListOf<Char>()
        for (i in 0 until TOKEN_SIZE) {
            token[i] = symbols.random()
        }
        println(token)
        return token.joinToString("")
    } else return null
}

fun basket(token: String): MutableList<String> {
    val basket = mutableListOf("Грецкие орехи", "Копченая колбаса", "Ежедневник")
    val tokenReceiver = token
    return basket
}