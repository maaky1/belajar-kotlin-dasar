fun main() {
    var firstName: String = "Muhamad"
    var lastName: String = "Agus Fikry"
    var fullName: String = "Muhamad Agus Fikry"
    var address: String = """
       Jl Cibogo Bawah 25 D, 
       Bandung,
       Jawa Barat
    """
    println(firstName)
    println(lastName)
    println(fullName)
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
}