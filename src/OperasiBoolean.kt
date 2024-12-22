fun main() {
    val nilaiUjian = 80
    val nilaiAbsen = 65
    val nilaiEkstra = 80

    val apakahLulusUjian = nilaiUjian > 75
    val apakahLulusAbsen = nilaiAbsen > 70
    val apakahLulusExtra = nilaiEkstra > 75

    val apakahLulus = apakahLulusUjian && apakahLulusAbsen && apakahLulusExtra
    println(apakahLulus)
}