package Lesson7

fun main() {

    /*N!=1*2*...*N faktorialni hisoblovchi haqiqiy  toifadagi Fact(N) rekursiv funksiyasi tuzilsin.
      (N>0 - butun toifadagi parametr). Shu funksiya yordamida berilgan 3ta sonning faktoriallari hisoblansin.*/

    val a = 6
    val b = 9
    val c = 3

    println("$a! = ${factorial(a)}, $b! = ${factorial(b)}, $c! = ${factorial(3)}")

}

fun factorial(n: Int): Int {
    return if (n == 1) {
        1
    } else {
        return n * factorial(n - 1)
    }
}