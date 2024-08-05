package Lesson3

import kotlin.math.sqrt

fun main() {

    //Doiraning yuzasi S berilgan. Uning diametri d va radiusi R aniqlansin. PI = 3.14 deb oling.
    //S = PI / R^2

    val s = 28.26
    val pi = 3.14
    val r = sqrt(s / pi)
    val d = r * 2

    println("Radius:$r, diameter:$d")
}