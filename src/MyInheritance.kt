

// Для всех классов в языке Koltin родительским суперклассом является класс Any

// ключевое слово open открывает класс, функции и поля для наследовния
open class Room() {
    open var name = "Room"
    fun description() = ": $name"
    open fun load() = "Nothing much to see here..."
    protected open val level = 5
}


open class TownSquare() : Room() {
    override var name = "Town"
    open override fun load() = "The villagers rally and cheer as you enter!"
    override val level = super.level + 1
}

class Plazza : TownSquare() {
    override var name = "Plazza"
}


fun main(args: Array<String>) {
    var currentRoom : Room = TownSquare()
    println(currentRoom.description())
    println(currentRoom.load())

    var plazza : Room = Plazza()
    println(plazza.name)
    println(plazza.load())

    println(plazza is Room)
    println(Room() is TownSquare)


}
