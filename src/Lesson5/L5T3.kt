package Lesson5

import java.util.Scanner

fun main() {

    /*1-999 oraliqdagi sonlar berilgan. Berilgan sonni "ikki xonali juft son",
      "uch xonali toq son" va h.k ekranga yozadigan programma tuzilsin.*/

    val scanner = Scanner(System.`in`)

    print("Sonni kiriting: ")
    val number = scanner.nextInt()

    if (number < 10 && number % 2 == 0) {
        println("$number bir xonali juft son")
    } else if (number < 10 && number % 2 == 1) {
        println("$number bir xonali toq son")
    } else if (number < 100 && number % 2 == 0) {
        println("$number ikki xonali juft son")
    } else if (number < 100 && number % 2 == 1) {
        println("$number ikki xonali toq son")
    } else if (number < 1000 && number % 2 == 0) {
        println("$number uch xonali juft son")
    } else {
        println("$number uch xonali toq son")
    }
}