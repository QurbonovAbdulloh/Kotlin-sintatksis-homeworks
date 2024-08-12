package Homework

fun main() {
    /*Massiv elementlari berilgan. Massivning ikkinchi eng katta elementini aniqlang.*/

    val numbers = arrayOf(1, 2, 3, 4, 5)

    var bigNumber = numbers[0]

    for (i in numbers.indices) {
        if (bigNumber < numbers[i]) {
            bigNumber = numbers[i]
        }
    }

    var secondBigNumber = numbers[0]
    var result = numbers[0]

    for (i in numbers.indices) {
        if (secondBigNumber < numbers[i]) {
            secondBigNumber = numbers[i]
            if (secondBigNumber < bigNumber) {
                result = secondBigNumber
            }
        }
    }

    println("Second big number is: $result")
}