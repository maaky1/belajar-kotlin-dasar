fun main() {
    var i = 0
    while (true) {
        println("Hello to $i")
        i++

        if (i > 5) {
            break
        }
    }

    for (i in 1..10) {
        if (i % 2 == 0) {
            continue
        }
        println("Nomer $i")
    }
}