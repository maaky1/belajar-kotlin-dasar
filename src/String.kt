fun main() {
    var firstName: String = "Muhamad"
    var lastName: String = "Agus Fikry"
    var address: String = """
       Jl Cibogo Bawah 25 D, 
       Bandung,
       Jawa Barat
    """
    println(firstName)
    println(lastName)
    println(address)

    var address1: String = """
       |Jl Cibogo Bawah 25 D, 
       |Bandung,
       |Jawa Barat
    """.trimMargin()
    var address2: String = """
       >Jl Cibogo Bawah 25 D, 
       >Bandung,
       >Jawa Barat
    """.trimMargin(">")
    println(address1)
    println(address2)

    var fullName1: String = firstName + " " + lastName
    println(fullName1)

    var fullName: String = "$firstName $lastName"
    var desc: String = "$fullName length is ${fullName.length}"
    println(fullName)
    println(desc)
}