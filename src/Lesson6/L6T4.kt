package Lesson6

import java.util.Scanner

fun main() {

    /*String xy-muvozanatlangan deb qarab, satrdagi  'x' belgilaridan keyin  satrda 'y' char mavjud bo'lsa,
      berilgan ifoda muvozanatlangan , yoki aksincha. Berilgan satr xy-muvozanatlangan bo'lsa, haqiqiy qiymatni qaytaring.
      Masalan:
      ("aaxbby") → true
      ("aaxbb") → false
      ("xaxxbby") → true
      ("yyabxccy") → true*/


    print("So'zni kiritng: ")
    val word = readln()
    println(muvozanatlanga(word))


   /* for (i in 0..text.length) {

    }*/
}

fun muvozanatlanga(x: String): Boolean {

    val indexOfX = x.indexOf('x')
    val indexOfY = x.indexOf('y')

    return indexOfY > indexOfX && indexOfX != -1 && indexOfY != -1
}