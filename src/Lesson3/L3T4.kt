package Lesson3

fun main() {

    /*Kun boshidan boshlab N sekund vaqt o'tdi.
      Kun boshidan boshlab qancha soat, minut va sekund o'tganini aniqlovchi dastur tuzilsin.*/

    val n = 600000
    val hours = n / 3600
    val minutes = n % 3600 / 60
    val seconds = n % 60

    println("$n seconds = $hours hours $minutes minutes $seconds seconds")
}