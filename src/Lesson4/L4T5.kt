package Lesson4

fun main() {

    /*Berilgan string ma’lumotning oxirgi 2 ta elementini boshidan yozing. Masalan: Kotlin> inKotl*/

    val word = "Kotlin"
    val end = word.substring(word.length - 2)
    val start = word.subSequence(0, word.length - 2)
    println("$end$start")


}