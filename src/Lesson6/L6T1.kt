package Lesson6

fun main() {

    /*n butun son berilgan (n>0). Quyidagi yig'indini hisoblovchi programma tuzilsin. S=1+1/2+1/3+1/4+.... +1/n*/

    /*print("Sonni kiriting: ")
    val n = readln().toInt()

    var sum = 0.0

    for (i in 1..n) {
        sum += 1 / i
    }

    println(sum)*/

    print("Sonni kiriting: ")
    val n = readln().toInt()
    var i = 1
    var sum = 0.0
    while (i <= n) {
        sum = sum + 1/i.toDouble()
        i++
    }

    println(sum)
}