package Lesson5

import java.util.Scanner

fun main() {

    /*Oy raqami berilgan. Shu oyda necha kun borligini aniqlovchi programma tuzilsin.*/

    val scanner = Scanner(System.`in`)

    print("Sonni kiriting: ")
    val number = scanner.next()

    when(number) {
        "1" -> println("Bu oyda 31 kun bor")
        "2" -> println("Bu fevral oyi bo'lib, har to'rt yilda 29 kun, qolgan yilda 28 kun bo'ladi")
        "3" -> println("Bu oyda 31 kun bor")
        "4" -> println("Bu oyda 30 kun bor")
        "5" -> println("Bu oyda 31 kun bor")
        "6" -> println("Bu oyda 30 kun bor")
        "7" -> println("Bu oyda 31 kun bor")
        "8" -> println("Bu oyda 31 kun bor")
        "9" -> println("Bu oyda 30 kun bor")
        "10" -> println("Bu oyda 31 kun bor")
        "11" -> println("Bu oyda 30 kun bor")
        "12" -> println("Bu oyda 31 kun bor")
        else -> println("To'g'ri sonni kiriting!")
    }
}