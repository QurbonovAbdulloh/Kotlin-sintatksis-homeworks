package Lesson4

import kotlin.math.ceil
import kotlin.math.pow

fun main() {

    //Kotlinda qiymatning kub ildizini qanday olish mumkin? Sodda dastur yarating. Misol: 125 = 5

    val a = 125
    val b = a.toDouble()
    val c = 1.0 / 3.0

    val result = ceil( b.pow(c))
    println(result)

}