package Homework

import java.util.Scanner

fun main() {

    /*m va n butun musbat sonlar berilgan , mxn o’lchamli matritsani hosil qiling*/

    val input = Scanner(System.`in`)
    print("Qatorlar sonini kiritng: ")
    val row = input.nextInt()

    print("Ustunlar sonini kiritng: ")
    val column = input.nextInt()

    val matrix = Array(row) {IntArray(column)}

    for (i in matrix.indices) {
        for (j in matrix.indices) {
            matrix[i][j] = i * 10
        }
    }

    for (i in 0 until row) {
        for (j in 0 until column) {
            println("${matrix[i][j]}")
        }
    }
}