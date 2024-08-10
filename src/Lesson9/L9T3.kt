package Lesson9

import java.util.Scanner

fun main() {

    /*Masalan sizda 50 Mbt bor. Siz internetdan ixtiyoriy faylni ko'chirib olmoqchisiz.
      Faylni ko'chirish uchun faylni hajmi oldindan ma'lum.
      Agar faylni ko'chirish uchun sizning trafigingiz yetsa, ko'chirib olsin, aks holda Exceptionda ma'lumot chiqarsin.
      Kiruvchi ma'lumotlar sizdagi trafik va faylni umumiy hajmi.*/

    val input = Scanner(System.`in`)

    val phone = 50
    println("Sizda 50Mbt bor")

    print("Yuklab olmoqchi bo'lgan faylingiz hajmini kiriting: ")
    val file = input.nextInt()

    if (phone > file) {
        println("Fayl muvaffaqiyatli yuklab olindi")
    } else {
        throw ArithmeticException("Fayl yuklanmadi!")
    }
}