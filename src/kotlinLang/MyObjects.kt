package kotlinLang

// Есть три способа применения ключевого слова object:
// для создания синглтонов, анонимных объектов и вспомогательных объектов.

// синглтон
object Game {
    init {
        println("Welcome, adventurer.")
    }
}

// анонимный объект
// объект для разового использования
val abandonedTownSquare = object : TownSquare() {
    override fun load() = "You anticipate applause, but no one is here..."
}

// вспомогательный объект - модификатор companion
// Инициализация в двух случаях:
// 1) инициализация вмещающего класса
// 2) прямое обращение к одному из свойств или функций.
class PremadeWorldMap {
    companion object {
        private const val MAPS_FILEPATH = "nyethack.maps"
    }
}


// класс данных
// для хранения данных - отмечается ключевым словом data:
data class User(val name: String, val age: Int)
// компилятор автоматически формирует следующие члены
// equals()/hashCode(), функцию toString() в форме java, copy()
// компонентные функции componentN(), ения,

data class Coordinate(val x: Int, val y: Int) {
    val isInBounds = x >= 0 && y >= 0

    // перегрузка операторов
    operator fun plus(other: Coordinate) = Coordinate(x + other.x, y + other.y)
}


fun main(args: Array<String>) {
    Game
    val a : Coordinate = Coordinate(1, 2)
    println(Coordinate(1, 0) == Coordinate(1, 0))
    println(Coordinate(1, 0) === Coordinate(1, 0))

    println(Coordinate(1, 0) + Coordinate(1, 0))
}









