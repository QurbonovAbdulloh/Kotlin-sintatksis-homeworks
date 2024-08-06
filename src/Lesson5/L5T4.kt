package Lesson5

import java.util.Scanner

fun main() {

    /*1-7 gacha bo'lgan butun sonlar berilgan. Kiritilgan songa mos ravishda  hafta kunlarini so'zda ifodalovchi programma tuzilsin.
      (1-Dushanba, 2-Seshanba,...)*/

    val scanner = Scanner(System.`in`)

    print("Sonni kiriting: ")
    val number = scanner.next()

    when(number) {
        "1" -> println("Dushanba")
        "2" -> println("Seshanba")
        "3" -> println("Chorshanba")
        "4" -> println("Payshanba")
        "5" -> println("Juma")
        "6" -> println("Shanba")
        "7" -> println("Yakshanba")
        else -> println("To'g'ri sonni kiriting!")
    }
}