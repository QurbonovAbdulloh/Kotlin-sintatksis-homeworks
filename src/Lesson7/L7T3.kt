package Lesson7

import java.util.Scanner
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {

    /*IsSquare(K) mantiqiy funksiyasini hosil qiling. (K>0).
      Agar K biror butun sonning kvadrati bo’lsa- true, aks holda false qiymati qaytarilsin.*/

    val scanner = Scanner(System.`in`)

    print("Sonni kiriting: ")
    val number = scanner.nextInt()

    println(isSquare(number))
}

fun isSquare(k: Int): Boolean {
    return (sqrt(k.toDouble())).pow(2) == k.toDouble()
}

fun isSquare1(k: Int): Boolean {
    for (i in 1..sqrt(k.toDouble()).toInt()) {
        if (i * i == k) {
            return true
            break
        }
    }
    return false
}