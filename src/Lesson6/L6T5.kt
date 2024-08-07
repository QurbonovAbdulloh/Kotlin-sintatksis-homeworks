package Lesson6

fun main() {

    /*A va B butun soni berilgan (A-B). A va B sonlari orasidagi barcha butun sonlarni chiqaruvchi programma tuzilsin.
     Bunda A soni 1 marta, (A+1) soni 2 marta chiqariladi va h.k.*/

    print("""ESLATMA: Birinchi kiritgan soningiz ikkinchi kiritmoqchi bo'lgan soningizdan kichik bo'lishi kerak!
        |Birinchi sonni kiriting: 
    """.trimMargin())
    val a = readln().toInt()

    print("Ikkinchi sonni kiritng: ")
    val b = readln().toInt()

    for (i in a..b) {
        var j = i
        while (j > 0) {
            println(i)
            j--
        }
    }
}