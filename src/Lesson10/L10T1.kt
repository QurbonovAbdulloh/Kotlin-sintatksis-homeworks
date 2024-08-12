package Lesson10

import java.util.Scanner

fun main(args: Array<String>) {

    /*Ro'yxatdan o'tish tizimini tashkil qilish. Juda ko'plab tizimlarda email yoki username orqali ro'yxatdan o'tish talab etiladi.
     Null safety mavzusini bilgan holda siz shunday tizim yaratingki, xohlansangiz username xohlasangiz email orqali tizimga kirish imkoniyati yaratilsin.
     Tizimda funksional imkoniyatlarini ko'rsatib bering.*/

    val scanner = Scanner(System.`in`)

    val usernameArray = arrayOfNulls<String>(100)
    val emailArray = arrayOfNulls<String>(100)

    var count = 0
    while (true) {
        println("""1 -> Ro'yxatdan o'tish kirish
            |2 -> Tizimga kirish 
        """.trimMargin())

        when(scanner.next()) {
            "1" -> {
                print("Foydalanish uchun username kiriting: ")
                val username = scanner.next()
                print("Emailingizni kiriting: ")
                val mail = scanner.next()

                usernameArray[count] = username
                emailArray[count] = mail
                count++
                println("Ma'lumotlar saqlandi!")
            }
            "2" -> {
                var isHave = false
                var index = -1

                print("Usernameingizni kiriting: ")
                val userName = scanner.next()
                print("Emailingizni kiriting: ")
                val email = scanner.next()

                for (i in 0..<count) {
                    if (usernameArray[i] == userName && emailArray[i] == email) {
                        isHave = true
                        index = i
                        break
                    }
                }

                if (isHave) {
                    println("Tizimga xush kelibsiz. Xurmatli ${userName[index]}")
                } else {
                    println("Bunday foydalanuvchi mavjud emas yoki kiritilgan ma'lumotlar noto'g'ri!")
                }
            }
            "3" -> {}
            "4" -> {}
            "5" -> {}
            "6" -> {}
        }
    }
}