package Lesson7

import java.util.Scanner

fun main() {

    /*Berilgan satrning har bir elementini ‘*’ belgisi bilan ajratuvchi funksiya tuzilsin.
      Masalan:
      “Kotlin”- “K*o*t*l*i*n”*/

    val scanner = Scanner(System.`in`)

    print("So'zni kiriting: ")
    var text = scanner.nextLine()
    var res: String = polindrom((text))
    println(res)
}

fun polindrom(s: String, n: Int = s.length, k: Int = 0): String {
    if (n - 1 == k) {
        return s
    } else {
        return polindrom(s.substring(0, 2 * k + 1) + "*" + s.substring(2 * k + 1), n + 0, k + 1)
    }
}