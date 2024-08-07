package Lesson6

import kotlin.math.pow

fun main() {

    /*n butun soni va a haqiqiy soni berilgan (n>0).
      Bir sikldan foydalanib quyidagi a ning 1 dan n gacha bo'lgan barcha darajalarini chiqaruvchi programma tuzilsin.*/

    print("'n'ni kiriting: ")
    val n = readln().toInt()
    print("'a'ni kiriting: ")
    val a = readln().toInt()

    for (i in 1..n) {
        println(a.toDouble().pow(i.toDouble()))
    }
}