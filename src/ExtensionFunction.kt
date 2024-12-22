fun String.hello(): String = "Hello $this"

fun String.printHello(): Unit = println("Hello $this")

fun main() {
    val name = "Agus"
    println(name.hello())
    name.printHello()
    "A".printHello()
}