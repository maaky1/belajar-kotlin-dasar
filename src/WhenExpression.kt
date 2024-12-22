fun main() {
    val finalExam = 'A'
    when (finalExam) {
        'A' -> println("Amazing")
        'B' -> println("Good")
        'C' -> println("Not Bad")
        'D' -> println("Bad")
        'E' -> println("Try Again")
        else -> println("Ups")
    }

    when (finalExam) {
        'A', 'B', 'C' -> println("Pass")
        else -> println("Not Pass")
    }

    val passValue = arrayOf('A', 'B', 'C')
    when (finalExam) {
        in passValue -> println("Pass")
        !in passValue -> println("Try Again")
    }

    val name = "Test"
    when (name) {
        is String -> println("This is String")
        !is String -> println("This isn't String")
    }

    val examValue = 80
    when {
        examValue > 75 -> println("Good")
        examValue > 60 -> println("Not Bad")
        else -> println("Try Again")
    }
}