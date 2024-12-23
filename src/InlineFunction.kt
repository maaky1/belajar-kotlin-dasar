inline fun hello(firstName: () -> String,
                 noinline lastName: () -> String): String {
    return "Hello ${firstName()} ${lastName()}"
}

fun main() {
    println(hello({ "Agus" }, { "F" }))
}