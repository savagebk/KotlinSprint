package lesson_11

import kotlin.Int

class Room(
    val id: Int,
    val roomName: String,
    val cover: String,      //путь к файлу обложки
    val users: MutableList<Person> = mutableListOf(),
    val statusList: List<String> = listOf<String>("Микрофон выключен", "Разговаривает", "Пользователь заглушен")
) {

    fun addPerson(person: Person) {
        users.add(person)
    }

    fun statusRenew(person: Person, newStatus: String) {
        person.statusChange(newStatus)
    }
}

class Person(
    val id: Int,
    val nickName: String,
    val avatar: String,      //путь к файлу аватара
    var status: String = "Микрофон выключен",
) {

    fun statusChange(newStatus: String){
        status = newStatus
    }
}

fun main() {
    val room = Room(
        id = 0,
        roomName = "Гостиная",
        cover = "cover.png"
    )

    val person1 = Person(
        id = 0,
        nickName = "Eugene",
        avatar = "eugene.jpg",
    )

    val person2 = Person(
        id = 1,
        nickName = "Michael",
        avatar = "michael.jpg",
    )

    room.addPerson(person1)
    room.addPerson(person2)

    room.statusRenew(person2, room.statusList[1])

}