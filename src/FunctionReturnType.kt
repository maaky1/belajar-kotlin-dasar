fun jumlahkan(a:Int, b:Int): Int {
    var total = a + b
    return total
}

fun bagi(a:Int, b:Int): Int {
    if (b == 0) {
        return 0
    } else {
        var total = a / b
        return total
    }
}

fun main() {
    println(jumlahkan(1, 2))
    println(bagi(1, 0))
    println(bagi(4, 2))
}