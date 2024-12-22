fun main() {
    var names: Array<String> = arrayOf("Budi", "Eko")
    println(names)
    names[0] = "Test"
    println(names[0])

    val nilai: Array<Int> = arrayOf(1, 2, 3)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    val members: Array<String?> = arrayOfNulls(3)
    members[0] = "1"
    members[1] = null
    members[2] = "2"
    println(members[0])
    println(members[1])
    println(members[2])
    println(members.size)
}