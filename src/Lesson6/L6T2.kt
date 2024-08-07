package Lesson6

fun main() {

    /*Berilgan satrning har bir elementni 2 martadan takrorlab chiqaring. Masalan: "Kotlin"-"KKoottlliinn"*/

    print("So'zni kiriting: ")
    val text = readln().toString()

    var s = 0
    while (s < text.length) {
        val newString = text[s]
        print(newString)
        print(newString)
        s++
    }
}