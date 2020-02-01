

fun nullable () {

// ПРОВЕРКИ НА NULL

    // переменные в отношении значения null делятся на два типа:
    // поддерживающие null и неподдерживающие
    // non-nullable
    var a: String = ""
    //a = null

    // nullable
    var b: String? = ""
    b = null


    // оператор безопасного вызова - ?.
    //Обнаружив null, он пропустит вызов функции и просто вернет null.
    //var beverage = readLine()?.capitalize()
    //beverage = null
    //println(beverage)


    // функция let
    // Когда beverage имеет значение, отличное от null, вызывается let и
    // выполняется тело анонимной функции, переданной в let
    var beverage = readLine()?.let {

        // ключевое слово it ссылается на переменную, для которой вызвана let
        if (it.isNotBlank()) {
            it.capitalize()
        } else {
            "Buttered Ale"
        }
    }
    //beverage = null
    println(beverage)


    // оператор !!.
    // вызывает объект в любом случае
    var beverage2 = readLine()!!.capitalize()
    // beverage2 = null
    println(beverage2)


    // проверка на null через if

    // оператор ?: - элвис
    // Если beverage == null, выведется вторая часть
    val beverageServed: String = beverage ?: "Buttered Ale"
    println(beverageServed)


    // обобщенный пример
    var beverage3 = readLine()
    beverage3?.let {
        beverage3 = it.capitalize()
    } ?: println("I can't do that without crashing - beverage was null!")


// ИСКЛЮЧЕНИЯ

}


fun main (args:Array<String>) {


    var swordsJuggling: Int? = null
    val isJugglingProficient = (1..3).shuffled().last() == 3
    if (isJugglingProficient) {
        swordsJuggling = 2
    }

    try {
        proficiencyCheck(swordsJuggling)
        swordsJuggling = swordsJuggling!!.plus(1)
    } catch (e: Exception) {
        println(e)
    }
    println("You juggle $swordsJuggling swords!")

}

fun proficiencyCheck(swordsJuggling: Int?) {

    // ключевое слово для возбуждения исключения
    swordsJuggling ?: throw IllegalStateException("Player cannot juggle swords")

    // второй вариант
    //swordsJuggling ?: throw UnskilledSwordJugglerException()

}


// объявление пользовательского исключения

class UnskilledSwordJugglerException() :
        IllegalStateException("Player cannot juggle swords")


// функции проверки условий
// checkNotNull(), require(), requireNotNull(), error(), assert()




