package Lesson7

import kotlin.random.Random

fun main() {

    /*Random holatda 3 ta turli hil sonlarni ekranga chiqaruvchi recursive funksiya tuzing. */
    random(3)
}

fun random(count: Int) {

    if (count <= 0) {
        return
    }
    val randomNum = Random.nextInt(1, 101)
    println("Son: $randomNum")

    random(count - 1)

}