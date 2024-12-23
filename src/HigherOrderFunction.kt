fun main() {
    fun hello(name: String, transform: (String) -> String): String {
        val nameTransform = transform(name)
        return "Hello $nameTransform"
    }
    val lambdaUpper = {value: String -> value.uppercase()}
    println(hello("Agus", lambdaUpper))
    println(hello("Agus", {value: String -> value.lowercase()}))

    val result = hello("Agus") {value: String -> value.lowercase()}
    println(result)
}