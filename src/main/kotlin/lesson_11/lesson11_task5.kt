package org.example.lesson_11

class Forum {
    val members = mutableListOf<ForumMember>()
    val messages = mutableListOf<ForumMessage>()
    var nextId = 0

    fun createNewUser(userName: String): ForumMember {
        val member = ForumMember(nextId++, userName)
        members.add(member)
        return member
    }

    fun createNewMessage(userId: Int, message: String) {
        messages.add(ForumMessage(userId, message))
    }

    fun printThread() {
        for (i in messages) {
            print("${members.find { it.userId == i.authorId}?.userName}: ${i.message} ")
        }
    }
}

class ForumMember (
    val userId: Int,
    val userName: String,
)

class ForumMessage (
    val authorId: Int,
    val message: String,
)

fun main() {
    val forum = Forum()
    forum.createNewUser("admin")
    forum.createNewMessage(forum.members[0].userId, "Приветствуем!")
    forum.createNewMessage(forum.members[0].userId, "Сейчас добавим модератора")

    forum.createNewUser("moderator")
    forum.createNewMessage(forum.members[1].userId, "Добрый день!")
    forum.createNewMessage(forum.members[1].userId, "Слежу за порядком")

    forum.printThread()
}

