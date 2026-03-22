package org.example.lessons1_10.lesson_10

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import java.security.KeyPairGenerator
import java.security.interfaces.RSAPrivateKey
import java.security.interfaces.RSAPublicKey
import java.util.*

const val CRED_USERNAME_RSA = "qwerty"
const val CRED_PASSWORD_RSA = "123456"
const val TOKEN_LIFETERM = 90000                       //мс

fun main() {

    val kpg = KeyPairGenerator.getInstance("RSA")
    kpg.initialize(2048)
    val kp = kpg.generateKeyPair()

    val priv = kp.private as RSAPrivateKey
    val publ = kp.public as RSAPublicKey

    print("Введите имя пользователя: ")
    val usernameInput = readln()
    print("Введите пароль: ")
    val passwordInput = readln()
    val token = authorization(usernameInput, passwordInput, priv, publ)
    if (token != null) {
        println ("В корзине: " + basket(token).joinToString(", "))
    } else {
        println ("Неудачная авторизация")
    }
}

fun authorization(username: String, password: String, privateKey: RSAPrivateKey, publicKey: RSAPublicKey): String? {
    if (username == CRED_USERNAME_RSA && password == CRED_PASSWORD_RSA) {
        val algorithm = Algorithm.RSA256(publicKey, privateKey)
        return JWT.create()
            .withSubject(username)
            .withIssuer("this-app")
            .withExpiresAt(Date(System.currentTimeMillis() + TOKEN_LIFETERM))
            .sign(algorithm)
    } else return null
}

fun basket (token: String?): MutableList<String> {
    val basket = mutableListOf ("Грецкие орехи", "Копченая колбаса", "Ежедневник")
    if (token != null) {
        return basket
    } else return mutableListOf ()
}