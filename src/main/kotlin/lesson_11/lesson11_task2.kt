package lesson_11

class User2(
    val id: Int,
    val userName: String,
    var password: String,
    val email: String,
    var bio: String? = null,
) {
    fun printInfo() {
        println("$id\n$userName\n$password\n$email\n$bio")
    }

    fun bioEdit() {
        print("Введите краткую информацию о себе: ")
        bio = readln()
    }

    fun passwordChange() {
        print("Введите старый пароль: ")
        val passwordInput = readln()
        if (passwordInput == password) {
            print("Введите новый пароль: ")
            val newPasswordInput = readln()
            if (newPasswordInput.isBlank()) {
                println("Нельзя использовать пустой пароль. Пароль не изменен.")
            } else {
                password = newPasswordInput
                println("Пароль изменен")
            }
        } else {
            println("Введен неверный пароль")
        }
    }
}

fun main() {
    val user0 = User2(
        id = 0,
        userName = "root",
        password = "veryStrongPassword",
        email = "root@system.com",
    )

    user0.bioEdit()

    println("\nИзменение пароля:")
    user0.passwordChange()

    println("\nИнформация о пользователе:")
    user0.printInfo()
}