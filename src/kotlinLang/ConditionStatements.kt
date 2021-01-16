package kotlinLang// == - сравнение чисел по значению
// === - сравнение ссылок

fun main(args: Array<String>) {
    val name = "Madrigal"
    var healthPoints = 20
    val isBlessed = true


    // пример if / else
    var healthStatus =
            if (healthPoints == 100) {
                "is in excellent condition!"
            } else if (healthPoints >= 90) {
                "has kotlinLang.a few scratches."
            } else if (healthPoints >= 75) {
                if (isBlessed) {
                    "has some minor wounds but is healing quite quickly!"
                } else {
                    "has some minor wounds."
                }
                // ИНТЕРВАЛЫ - ключевое слово in
            } else if (healthPoints in 15..74) {
                "looks pretty hurt."
            } else {
                "is in awful condition!"
            }
    println(name + " " + healthStatus)


    // пример when
    // По умолчанию условное выражение when действует подобно оператору сравнения ==
    healthStatus = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has kotlinLang.a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }

    // применение шаблонных строк
    println("$name : $healthStatus")
    // пример с логикой
    println("(Blessed: ${if (isBlessed) "YES" else "NO"})")


}


