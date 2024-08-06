package Lesson4

fun main() {

    /*Kiritilayotgan string ma’lumotning oxirgi 2 elementini 3 marta chop qiling.
      String ma’lumot kamida 2 ta elementdan iborat bo’lishi kerak.*/

    val word = "word"
    val index = word.substring(word.length - 2)

    println("$index$index$index")
}