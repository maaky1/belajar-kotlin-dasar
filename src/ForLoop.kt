fun main() {
    var array = arrayOf("a", "b", "c")

    var total = 0;
    for (name in array) {
        println(name)
        total++
    }
    println("Total perulangan = $total")

    for (i in 0..10 step 2) {
        println(i)
    }

    val ukuranArray = array.size - 1
    for (i in 0..ukuranArray) {
        println("Index $i = ${array.get(i)}")
    }
}