package org.example.lesson_11

class Forum {
    private val members = mutableListOf<ForumMember>()
    private val messages = mutableListOf<ForumMessage>()
    private var nextId = 0

    fun createNewUser(userName: String): ForumMember {
        val member = ForumMember(nextId++, userName)
        members.add(member)
        return member
    }

    fun createNewMessage(userId: Int, message: String) {
        if (members.any { it.userId == userId }) {
                messages.add(ForumMessage(userId, message))
            }
        }

    fun printThread() {
        for (i in messages) {
            println("${members.find { it.userId == i.authorId}?.userName}: ${i.message} ")
        }
    }
}

class ForumMember(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
)

fun main() {
    val forum = Forum()
    val firstUser = forum.createNewUser("admin")
    forum.createNewMessage(firstUser.userId, "Приветствуем!")
    forum.createNewMessage(firstUser.userId, "Сейчас добавим модератора")

    val secondUser = forum.createNewUser("moderator")
    forum.createNewMessage(secondUser.userId, "Добрый день!")
    forum.createNewMessage(secondUser.userId, "Слежу за порядком")

    forum.printThread()
}

