fun main() {
    // Underscore in number
    var age: Byte = 30
    var height: Int = 150
    var distace: Short = 2000
    var balance: Long = 10000L
    println(age)
    println(height)
    println(distace)
    println(balance)

    // Floating point number
    var value: Float = 98.98F // Harus diakhiri F agar tidak terbaca atribut double
    var radius: Double = 2324.2211
    println(value)
    println(radius)

    // Literals
    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xFF
    var binaryLiteral: Int = 0b0101
    println(decimalLiteral)
    println(hexadecimalLiteral)
    println(binaryLiteral)

    // Conversion
    var number: Int = 100
    var byte: Byte = number.toByte()
    var short: Short = number.toShort()
    var int: Int = number.toInt()
    var long: Long = number.toLong()
    var float: Float = number.toFloat()
    var double: Double = number.toDouble()
    println(byte)
    println(short)
    println(int)
    println(long)
    println(float)
    println(double)
}