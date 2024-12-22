infix fun String.to(type: String): String {
    if (type != "UP") {
        return this.lowercase()
    } else {
        return this.uppercase()
    }
}

fun main() {
    val name = "Agus" to "UP"
//    val name = "Agus".to("UP")
    println(name)
}