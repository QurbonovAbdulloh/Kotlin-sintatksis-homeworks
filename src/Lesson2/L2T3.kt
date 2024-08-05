package Lesson2

fun main() {

    //Ikkita o’zgaruvchi qiymatlari o’rnini almashtiruvchi dasturni tuzing

    var a = "a"
    var b = "b"
    val c = a
    a = b
    b = c

    println("a = $a, b = $b")
}