package Lesson7

fun main() {

    /*Berilgan satrdagi barcha ‘x’ elementlarini satr so’ngiga o’tkazuvchi funksiya tuzilsin.Masalan:
      ("xxre") → "rexx"
      ("xxhixx") → "hixxxx" */

    println(x("xfsdalxxfjlskd"))

}

fun x(s: String, n: Int = s.length, k: Int = 0): String {
    if (k == n) {
        return s
    } else {
        if (s[0] == 'x') {
            return x(s.substring(1) + "x", n + 0, k + 1)
        } else {
            return s[0] + x(s.substring(1), n + 0, k + 1)
        }
    }
}