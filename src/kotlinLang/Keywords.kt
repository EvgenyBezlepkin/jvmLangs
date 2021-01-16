package kotlinLang

//vararg
// позволяет передавать нефиксированное число аргументов для параметра
// пример
fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts - это массив (Array)
        result.add(t)
    return result
}

val list = asList(1, 2, 3)


// оператор распаковки *
// передача массива в котлин требует его распаковки
// пример
fun a() {
    val arg: Array<String> = arrayOf("1", "2")
    val list = listOf("args", *arg)
    println(list)
}


//open
// позволяет создавать подклассы класса или переопределять функции и поля


//override
// помечает элемент как переопределение элемента суперкласса
// пример
open class Ro(val name: String) {
    fun description() = "kotlinLang.Ro: $name"
    open fun load() = "Nothing"
    protected open val level = 5
}

class Town : Ro("kotlinLang.Town Square") {
    override fun load() = "The"
    override val level = super.level + 1
}


// companion
// объявляет объект-компаньон,  инициализируется в момент, когда загружается обрамляющий класс
// пример
class MyClass {
    companion object : Comparable<String> {
        override fun compareTo(other: String): Int = 1
    }
}
val instance = MyClass.compareTo("")


//get
// объявляет геттер свойства
// пример
        // field - теневое поле в котрое записывается значение
class A {
    var stringRepresentation: Int = 1
        get() = this.hashCode()
        set(value) {
            if (value >= 0) field = value
        }
}


// data
// класс данных
data class User2(val name: String, val age: Int)
// компилятор автоматически формирует следующие члены
// equals()/hashCode(), функцию toString() в форме java, copy()
// компонентные функции componentN(), ения,


//operator
// обозначает функцию как перегрузку оператора или реализацию соглашения
// пример
data class Point(val x: Int, val y: Int)
operator fun Point.unaryMinus() = Point(-x, -y)
val point = Point(10, 20)
//println(-kotlinLang.getPoint)  // выведет "(-10, -20)"











