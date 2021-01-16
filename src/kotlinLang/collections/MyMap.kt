package kotlinLang.collections

fun main (args:Array<String>){


    val patronGold = mapOf("Eli" to 10.5, "Mordoc" to 8.0, "Sophie" to 5.5)

    println(patronGold.entries)
    println(patronGold.keys)
    patronGold.forEach { (k,v) -> print(k + v)}


    val patronGold2 = mutableMapOf("Eli" to 5.0, "Sophie" to 1.0)
    patronGold2 += "Sophie" to 6.0
    println(patronGold2)

    println(patronGold["El"])
    println(patronGold["El"] ?: "jk")

}