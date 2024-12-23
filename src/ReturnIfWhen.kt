fun main() {
    fun sayHai(name: String = ""): String {
//        return if (name == "") {
//            "Hello bro"
//        } else {
//            "Hello $name"
//        }
        return when(name) {
            "" -> "Hello Bro"
            else -> "Hello $name"
        }
    }

    println(sayHai())
    println(sayHai("Agus"))
}