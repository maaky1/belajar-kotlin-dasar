const val APP = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {
    var firstName: String? = "Agus"
    firstName = null
    println(firstName)
    println(firstName?.length)

    var name: String? = null
    name = "Test"
    println(name)
    println(name?.length)

    println("Welcome to $APP version $VERSION")
}