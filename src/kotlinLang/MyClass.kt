package kotlinLang

//Классы в Kotlin не могут иметь полей.
// Т.е. переменные, которые вы объявляете внутри класса являются свойствами,
// т.к. для них неявно реализуются методы get и set.
// переменная, в которой находится значение свойства, называется теневым полем



class Player {
    // дефолтный конструктор конструируется и вызывается самостоятельно
    var name = "madrigal"
        // область видимости методов свойств совпадает с областью видимости самих свойств.
        get() = field.capitalize()
        // можно открыть геттер, но закрыть сеттер
        private set(value) {
            field = value.trim()
        }
    var name2 = "madrigal"
        get() = field.toUpperCase()
    // сеттер добавился по умолчанию
    val name3 = "g" // доступно только для чтения

    // вычисляемое свойство, ему нельзя присвоить начальное значение
    val rolledValue
        get() = (1..6).shuffled().first()

}


// объявление главного конструктора
class Player2(_name: String = "hello",
              var name2: String? = null) {

    // позволит отложить инициализацию свойства пока такая возможность не появится.
    lateinit var k: Integer

    // вспомогательный конструктор
    // в нем нельзя определить свойства
    constructor(name: String) : this(name, name2 = "help")

    // для первого параметра конструктора определяем свойство, чтобы работать c get, set
    var name = _name
        get() = field.capitalize()

    // блок инициализации
    // Код в блоке инициализации выполняется сразу после создания экземпляра класса
    // Все свойства, используемые в блоке, должны инициализироваться раньше объявления блока
    init {
        require(_name.length != 0,
                { "healthPoints must be greater than zero." })
    }

    override fun toString(): String {
        return "$name , $name2"
    }
}


// ПРИМЕР ОБШИБКИ ИНИЦИАЛИЗАЦИИ
class P{
    val name:String
    private fun a() = name[0]

    init {
        //name = "N"
        a()
        name = "N"
    }
}



fun main(args: Array<String>) {

    val a = Player()
    a.name2 = "g"
    println(a.name2)
    println(a.rolledValue)

    val b = Player2()
    println(b)

    // можно передавать имя параметра
    val c = Player2(name = "Hi")
    println(c)

    val d = P()

}