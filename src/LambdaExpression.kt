fun toUpper(value: String): String = value.uppercase()

fun main() {
    val contohLambda: (String, String) -> String = {
        firstName: String, lastName: String -> val result = "$firstName $lastName"
        result
    }
    println(contohLambda("Agus", "F"))

    val sayHello: (String) -> String = {
        "Hello $it"
    }
    println(sayHello.invoke("Agus"))

    val toUpperCase: (String) -> String = ::toUpper
    println(toUpperCase("Agus"))
}