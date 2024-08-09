package Homework

fun main() {

    /*n ta butun sonlardan iborat massiv berilgan.
      Massivdagi har bir toq sonni oxirgi toq songa orttiruvchi programma tuzilsin.
      Agar toq sonlar bo'lmasa, massiv o'zgarishsiz qoldirilsin.*/

    val numbers = arrayOf(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0)

    for (i in numbers.indices) {
        if (i < numbers.size - 2) {
            numbers[i] = (numbers[i] + numbers[i + 1]) / 2
            println(numbers[i])
        } else println(numbers[i])
    }
}