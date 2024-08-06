package Lesson4

fun main() {

    /*Kiritilgan string qiymatning oxirgi va undan oldingi element o’rinlarini o’zgartirgan holatda chop qiling.
      Masalan: coding-> codign.*/

    val word = "coding"
    val start = word.substring(0, word.length - 2)
    val end = word.substring(word.length - 2)
    val end1 = end[0]
    val end2 = end[1]
    println("$word change to -> $start$end2$end1")
}