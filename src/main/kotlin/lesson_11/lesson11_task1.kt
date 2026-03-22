package org.example.lesson_11

class User (
    val id: Int,
    val userName: String,
    val password: String,
    val email: String,
)

fun main() {
    val user0 = User(
        id = 0,
        userName = "root",
        password = "veryStrongPassword",
        email = "root@system.com",
    )

    val user1 = User(
        id = 1,
        userName = "qwerty",
        password = "notVeryStrongPassword",
        email = "qwerty@users.com",
    )

    println(user0.id)
    println(user0.userName)
    println(user0.password)
    println(user0.email)

    println()
    println(user1.id)
    println(user1.userName)
    println(user1.password)
    println(user1.email)
}