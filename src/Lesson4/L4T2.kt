package Lesson4

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {

    /*To'g'ri burchakli uchburchakning katetlari berilgan. Uning gipotenuzasini toping.
      Kotlinda maxsus funksiya orqali gipotenuzani toping.*/

    // a*a + b*b = c*c

    val a = 3
    val b = 4
    val c = sqrt(a.toDouble().pow(2) + b.toDouble().pow(2))

    println(c)
}