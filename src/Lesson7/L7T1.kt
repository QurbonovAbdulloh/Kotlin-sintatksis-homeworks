package Lesson7

import java.util.*

fun main() {

    /*Butun musbat sonining raqamlarini teskari tartibda chiqaruvchi InvertDigit nomli funksiya hosil qiling.*/

        val k= Scanner(System.`in`)
        val n=k.nextInt()

        println(invertDigit(n))
}

fun invertDigit(son: Int) :Int {
    val sonSatr: String = son.toString()
    var teskariSon: String = ""
    var i = sonSatr.length

    while (i > 0) {
        teskariSon += sonSatr[i - 1].toString()
        i--
    }
    return teskariSon.toInt()
}