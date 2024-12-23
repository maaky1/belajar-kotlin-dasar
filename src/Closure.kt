fun main() {
    var counter = 0
    val lambdaInc: () -> Unit = {
        println("lambda increment")
        counter++
    }

    val anonymousInc = fun() {
        println("anonymous increment")
        counter++
    }

    fun functionInc() {
        println("function increment")
        counter++
    }

    lambdaInc()
    anonymousInc()
    functionInc()
    println(counter)
}