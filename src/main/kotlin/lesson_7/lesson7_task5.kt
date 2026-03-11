package org.example.lesson_7

const val MIN_PASSWORD_LENGTH = 6
const val TYPES_OF_SYMBOLS = 3


fun main() {

    val numbers = '0'..'9'
    val smallLetters = 'a'..'z'
    val largeLetters = 'A'..'Z'

    print("Введите длину пароля (минимум $MIN_PASSWORD_LENGTH символов): ")
    var passwordLength = readln().toInt()
    if (passwordLength < MIN_PASSWORD_LENGTH) {
        passwordLength = MIN_PASSWORD_LENGTH
        println("Длина пароля увеличена до $MIN_PASSWORD_LENGTH символов")
    }
    val symbols = numbers + largeLetters + smallLetters
    val password = MutableList(passwordLength) { ' ' }

    val preUsedPositions = mutableListOf<Int>()
    var currentIndex: Int

    //Случайным образом назначаем позиции в пароле, в которые будут вставлены символы
    //разных "обязательных" типов
    for (i in 1..TYPES_OF_SYMBOLS) {
        currentIndex = (0 until passwordLength).random()
        while (preUsedPositions.contains(currentIndex)) {
            currentIndex = (0 until passwordLength).random()
        }
        preUsedPositions.add(currentIndex)
    }

    //Заполняем ранее выбранные случайные позиции случайными символами разных типов
    for (i in 0 until TYPES_OF_SYMBOLS) {
        when {
            i == 0 -> password.set(preUsedPositions[i], numbers.random())
            i == 1 -> password.set(preUsedPositions[i], largeLetters.random())
            i == 2 -> password.set(preUsedPositions[i], smallLetters.random())
        }
    }

    for (i in password.indices) {
        if (preUsedPositions.contains(i)) {
            continue
        } else {
            password.set(i, symbols.random())
        }
    }

    println("Ваш пароль: " + password)
}