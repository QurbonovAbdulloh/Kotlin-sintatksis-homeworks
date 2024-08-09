package Homework

fun main() {

    /*N ta sonlardan iborat massiv berilgan.
      Massivning har bir elementini uning o’ng qo’shnisi bilan o’rta arifmetigiga almashtiruvchi dastur tuzing.*/

    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    var couple = ""

    for (i in numbers.indices) {
        if (numbers[i] % 2 == 0) {
            couple += "${numbers[i]}"
        }
    }

    println(couple)
}