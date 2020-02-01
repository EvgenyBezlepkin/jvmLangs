package collections

fun main (args: Array<String>){

    // все коллекции (до интерфейсов) фундаментально разделены на коллекции для чтения и изменяемые коллекции
    // Map относится к интерфейсу коллекций

    val a: List<String> = listOf("Eli", "Mordoc", "Sophie")

    println(a.last())

    try {
        println(a.last { x -> x.contains("a") })
    } catch (e : NoSuchElementException) {
        println(e)
    }

    var b: MutableList<String> = a.toMutableList()
    var c : List<String> = b.toList()

    println(a.getOrNull(3) ?: "-1")
    println(a.getOrElse(3) {"-1"})

    mutableListOf("Eli","Mordoc","Sophie") += listOf("Alex", "Shruti")

    for(i in 1..10){ print(i) }
    println()
    a.forEach { it -> print(it) }
    println()
    a.forEachIndexed { index, s ->  println("$index, $s")}

    // деструктуризация
    val (type, name, price) = a.toString().split(",")
    print(name)


    // SET
    // можно запрашивать элемент по позиции .elementAt(index)


}
