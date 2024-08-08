package Lesson7

fun main() {

    /*Haqiqiy sonning ishorasini aniqlovchi ishora nomli funksiya hozil qiling.
      Funksiya argumenti noldan kichik bo’lsa -1, noldan katta bo’lsa 1, nolga teng bo’lsa 0 qiymat qaytarsin.*/

    print("Sonni kiriting: ")
    val number = readln().toInt()

    println(sign(number))
}

fun sign(n: Int): Int {
    return if (n > 0) {
        1
    } else if (n < 0) {
        -1
    } else 0
}