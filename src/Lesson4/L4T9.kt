package Lesson4

fun main() {

    /*Kiritilgan stringning berilgan indexdan boshlab qolgan qismini chop qiluvchi dastur yozing.
      Masalan: String: android, index=2 Natija: “droid”;*/

    val index = 2
    val word = "android"
    val result = word.substring(index, word.length)
    println(result)
}