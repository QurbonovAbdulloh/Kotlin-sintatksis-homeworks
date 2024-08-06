package Lesson4

fun main() {

    /*Berilgan satrning 1-va oxirgi elementlarini olib tashlab, satrni chop qiling.*/

    val word = "Kotlin"
    val result = word.subSequence(1, word.length - 1)

    println(result)
}