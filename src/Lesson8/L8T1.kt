package Homework

import java.util.Scanner

fun main() {

    /*N ta natural son berilgan. Uning elementlarini teskari tartibda chiqaruvchi dastur tuzing.*/

    val input = Scanner(System.`in`)
    val numbers = input.nextInt()

    print("Sonlarni kiriting: ")

    val intNumber = IntArray(numbers)

    for (i in intNumber.indices) {
        intNumber[i] += input.nextInt() //intNumber[i] += input.nextInt()
    }

    var reversed = ""
    for (a in intNumber.size - 1 downTo 0) {
        reversed += intNumber[a].toString()
    }

    println(reversed)


}