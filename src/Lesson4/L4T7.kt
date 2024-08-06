package Lesson4

fun main() {

    /*Kiritilayotgan satrning o’rtasidagi 2 ta elementni chop qiladigan dastur yozing.*/

    val word = "Kotlin"
    val start = word.substring(0, word.length / 2)
    val first = start.substring(start.length - 1)
    val end = word.substring(word.length / 2, word.length)
    val second = end[0]
    println("$first$second")
}