@file:JvmName("L8T5Kt")

package Homework

import java.util.Scanner

fun main() {
    /*Massivlar yordamida lug'at dasturini yarating.
      So'zlarni qo'shish 2 turda olib boriladi. Masalan, so'z qo'shish ENG->UZB yoki UZB->ENG.
      So'z va tarjimasini qo'shish, o'chirish, o'zgartirish,
      barcha so'zlar ro'yxati(bunda 2 turda so'zlarni chiqarish imkoniyati bo'lsin), so'z qidirish.
      Men tizimga 2 ta turda so'zlarni qo'sha olishim ularni boshqara olishim kerak.*/

    val scanner = Scanner(System.`in`)

    val engWordArray = arrayOfNulls<String>(10)
    val uzbWordArray = arrayOfNulls<String>(10)
    var count = 0

    println("Dasturdan foydalanish uchun raqamlardan foydalaing!")

    myloop@ while (true) {

        println(
            """1 -> | Eng -> Uzb lug'atni boyitish
              |2 -> | Uzb -> Eng lug'atni boyitish
              |3 -> | So'zlarning tarjimasini qidirish
              |4 -> | So'zlarning ro'yxati
              |5 -> | So'zlarni tahrirlash
              |6 -> | So'zlarni o'chirish
            """.trimMargin()
        )

        when (scanner.next()) {
            "1" -> {
                print("Inglizcha so'zni kiriting: ")
                val engWord = scanner.next()
                print("So'zning o'zbek tilidagi tarjimasini kiritng: ")
                val uzbWord = scanner.next()

                engWordArray[count] = engWord
                uzbWordArray[count] = uzbWord
                count++
                println("So'z lug'at dasturiga muvaffaqiyatli saqlandi.")
            }
            "2" -> {
                print("O'zbekcha so'zni kiriting: ")
                val uzbWord = scanner.next()
                print("So'zning ingliz tilidagi tarjimasini kiriting: ")
                val engWord = scanner.next()

                uzbWordArray[count] = uzbWord
                engWordArray[count] = engWord
                count++
                println("So'z lug'at dasturiga muvaffaqiyatli saqlandi.")
            }
            "3" -> {
                println(
                    """
                    1 -> | Inglizcha - o'zbekcha
                    2 -> | O'zbekcha - inglizcha
                    3 -> | Bosh menyu
                """.trimIndent()
                )

                when (scanner.next()) {
                    "1" -> {
                        var isHave = false
                        var index = -1

                        print("So'zni kiriting: ")
                        val search = scanner.next()

                        for (i in 0 until count) {
                            if (engWordArray[i] == search) {
                                isHave = true
                                index = i
                                break
                            }

                            if (isHave) {
                                println("$search - ${uzbWordArray[index]}")
                            } else println("Lug'at dasturida bunday so'z  mavjud emas.")

                        }
                    }
                    "2" -> {
                        var isHave = false
                        var index = -1

                        print("So'zni kiritng: ")
                        val search = scanner.next()

                        for (i in 0 until count) {
                            if (uzbWordArray[i] == search) {
                                isHave = true
                                index = i
                                break
                            }
                        }

                        if (isHave) {
                            println("$search - ${engWordArray[index]}")
                        } else println("Lug'at dasturida bunday so'z mavjud emas.")
                    }
                    "3" -> {
                        continue@myloop
                    }
                }
            }
            "4" -> {
                while (true) {
                    println(
                        """
                        1 -> | Inglizcha - o'zbekcha so'zlar ro'yxati
                        2 -> | O'zbekcha - inglizcha so'zlar ro'yxati
                        3 -> | Bosh menyu
                    """.trimIndent()
                    )

                    when (scanner.next()) {
                        "1" -> {
                            for (i in 0 until count) {
                                println("${engWordArray[i]} - ${uzbWordArray[i]}")
                            }
                        }
                        "2" -> {
                            for (i in 0 until count) {
                                println("${uzbWordArray[i]} - ${engWordArray[i]}")
                            }
                        }
                        "3" -> {
                            continue@myloop
                        }
                    }
                }
            }
            "5" -> {
                var isHave = false
                var index = -1

                print(
                    """Qaysi so'zni o'zgartirmoqchisiz?
                    |O'zgartirmoqchi bo'lgan so'zingizni kiriting: 
                """.trimMargin()
                )
                val editWord = scanner.next()

                for (i in 0 until count) {
                    if (editWord.equals(uzbWordArray) || editWord.equals(engWordArray)) {
                        println("Siz o'zgartirmoqchi bo'lgan so'z topildi.")
                        isHave = true
                        index = i
                        break
                    }
                }
                if (isHave) {
                    print("\"$editWord\"ni o'zgartirish uchun yangi so'zni kiritng: ")
                    val newWord = scanner.next()

                    if (uzbWordArray[index] == editWord) {
                        uzbWordArray[index] = newWord
                    } else engWordArray[index] = newWord

                } else println("Siz o'zgartirmoqchi bo'lgan so'z topilmadi!")
            }
            "6" -> {
                var isHave = false
                var index = -1

                print(
                    """Qaysi so'zni o'chirmoqchisiz?
                    |O'chirmoqchi bo'lgan so'zingizni kiritng: 
                """.trimMargin()
                )
                val deleteWord = scanner.next()

                for (i in 0 until count) {
                    if (uzbWordArray[i] == deleteWord || engWordArray[i] == deleteWord) {

                        isHave = true
                        index = i
                        break
                    }
                }

                if (isHave) {
                    engWordArray[index] = null
                    uzbWordArray[index] = null

                    engWordArray[index] = engWordArray[index + 1]
                    uzbWordArray[index] = uzbWordArray[index + 1]
                    count--
                } else {
                    println("Siz o'chirmoqchi bo'lgan so'z topilmadi!")
                }
            }
            else -> {
                println("Menyudagi raqamlardan foydalaning!")
            }
        }
    }
}