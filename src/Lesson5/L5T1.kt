package Lesson5

import java.util.Scanner
import kotlin.math.abs

fun main() {

    /*Sonlar o'qida uchta A, B, C nuqtalar berilgan. A nuqtaga eng yaqin nuqta va ular orasidagi masofa topilsin.*/

    val scanner = Scanner(System.`in`)

    print("'A' nuqtani kiriting: ")
    val a = scanner.nextInt()
    print("'B' nuqtani kiriting: ")
    val b = scanner.nextInt()
    print("'C' nuqtani kiriting: ")
    val c = scanner.nextInt()

    if (abs(a - b) > abs(a - c)) {
        println("'A' nuqtaga eng yaqin nuqta 'C'")
    } else if (abs(a - b) == abs(a - c)) {
        println("'A' nuqtaga ikkala nuqta ham bir xil masofada turibdi")
    } else {
        println("'A' nuqtaga eng yaqin nuqta 'B'")
    }

}