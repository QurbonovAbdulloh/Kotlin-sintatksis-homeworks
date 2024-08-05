package Lesson3

fun main() {

    /*Uch xonali son berilgan. Uning o'nliklar xonasidagi raqam bilan birliklar xonasidagi raqamni almashtirishdan
      hosil bo'lgan sonni aniqlovchi dastur tuzilsin.*/

    val number = 127
    val firstNumber = number / 100
    val secondNumber = number / 10 % 10
    val thirdNumber = number % 10           // or | number - number / 10 * 10
    println("Number $number changed -> $firstNumber$thirdNumber$secondNumber")
    
}