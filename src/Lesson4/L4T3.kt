package Lesson4

import kotlin.math.max

fun main() {

    /*Berilgan 3 ta sondan kattasini chiqaruvchi dastur tuzing.*/

    val a = 11
    val b = 9
    val c = 5

    val result = max(a, max(b,c))
    println(result)
}