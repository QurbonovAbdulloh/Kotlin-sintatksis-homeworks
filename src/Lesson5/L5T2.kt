package Lesson5

import java.util.Scanner

fun main() {

    /*OX va OY koordinata o'qlarida yotmaydigan nuqta berilgan. Nuqta joylashgan koordinata choragi aniqlansin.*/

    val scanner = Scanner(System.`in`)

    print("'X' nuqtani kiriting: ")
    val x = scanner.nextInt()
    print("'Y' nuqtani kiriting: ")
    val y = scanner.nextInt()

    if (x > 0 && y > 0) {
        println("Nuqta 1-chorakda yotadi")
    } else if (x > 0 && y < 0) {
        println("Nuqta 2-chorakda yotadi")
    } else if (x < 0 && y < 0) {
        println("Nuqta 3-chorakda yotadi")
    } else if (x < 0 && y > 0) {
        println("Nuqta 4-chorakda yotadi")
    }
}