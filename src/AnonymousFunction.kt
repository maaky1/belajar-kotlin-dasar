fun main() {
    fun hello(name: String, transform: (String) -> String): String {
        val nameTransform = transform(name)
        return "Hello $nameTransform"
    }

    val upper = fun (value: String): String {
        return if (value.isBlank()) {
            "Oops"
        } else {
            value.uppercase()
        }
    }
    println(hello("Agus", upper))
    println(hello("", upper))
}