import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    val nameArray = arrayOfNulls<String>(100)
    val surnameArray = arrayOfNulls<String>(100)
    val ageArray = arrayOfNulls<Int>(100)
    val usernameArray = arrayOfNulls<String>(100)
    val passwordArray = arrayOfNulls<String>(100)
    val mailArray = arrayOfNulls<String>(100)
    var count: Int = 0

    myloop@while (true) {
        println("""1 -> Ro'yxatdan o'tish
            |2 -> Tizimga kirish
            |3 -> Foydalanuvchilar ro'yxati
            |4 -> Tahrirlash
            |5 -> O'chirish
            |6 -> Foydalanuvchi ma'lumotlari
        """.trimMargin())

        when(scanner.next()) {
            "1" -> {
                print("Ismingizni kiriting: ")
                val name: String = scanner.next()
                print("Familyangizni kiriting: ")
                val surname: String = scanner.next()
                print("Yoshingizni kiriting: ")
                val age: Int = scanner.nextInt()
                print("Foydalanish uchun \"Username\" kiriting: ")
                val userName: String = scanner.next()
                print("Email pochtangizni kiriting: ")
                val mail: String = scanner.next()
                print("Parol kiriting: ")
                val password: String = scanner.next()

                nameArray[count] = name
                surnameArray[count] = surname
                ageArray[count] = age
                usernameArray[count] = userName
                passwordArray[count] = password
                mailArray[count] = mail
                count++
                println("Ma'lumotlar saqlandi!")
            }
            "2" -> {

                var isHave: Boolean = false
                var index: Int = -1

                print("Username kiriting: ")
                val userName: String = scanner.next()
                print("Parolni kiriting: ")
                val password: String = scanner.next()

                for (i in 0 until  count) {
                    if (usernameArray[i] == userName && passwordArray[i] == password) {
                        isHave = true
                        index = i
                        break
                    }
                }

                if (isHave) {
                    println("Xush kelibsiz. Xurmatli: ${nameArray[index]} ")
                } else {
                    println("Bunday foydalanuvchi mavjud emas yoki kiritilgan ma'lumotlar xato!")
                }
            }
            "3" -> {
                for (i in 0 until  count) {
                    println("Foydalanuvchilar: ${usernameArray[i]}")
                }
            }
            "4" -> {
                var isHave = false
                var index = -1

                print("\"Username\"ni kiriting: ")
                val editUsername = scanner.next()
                print("Parolni kiriting: ")
                val editPassword = scanner.next()

                for (i in 0 until count) {
                    if (usernameArray[i] == editUsername && passwordArray[i] == editPassword) {


                        isHave = true
                        index = i
                        break
                    }
                }

                if (isHave) {

                    while (true) {
                        println("""Nimani o'zgartirmoqchisiz ${nameArray[index]}?
                            |1 -> Ismni 
                            |2 -> Familya
                            |3 -> Yosh
                            |4 -> Username
                            |5 -> Email
                            |6 -> Parol
                            |7 -> Bosh menyu
                        """.trimMargin())

                        when(scanner.next()) {

                            "1" -> {
                                print("Ismni kiriting: ")
                                val newName = scanner.next()
                                nameArray[index] = newName
                                println("Ism \"$newName\"ga o'zgardi.")
                            }
                            "2" -> {
                                print("Familyani kiriting: ")
                                val newSurname = scanner.next()
                                surnameArray[index] = newSurname
                                println("Familya  \"$newSurname\"ga o'zgardi.")
                            }
                            "3" -> {
                                print("Yoshni kiriting: ")
                                val newAge = scanner.nextInt()
                                ageArray[index] = newAge
                                println("Yosh \"$newAge\"ga o'zgardi.")
                            }
                            "4" -> {
                                print("\"Username\"ni kiriting: ")
                                val newUsername = scanner.next()
                                usernameArray[index] = newUsername
                                println("Username \"$newUsername\"ga o'zgardi.")
                            }
                            "5" -> {
                                print("Emailni kiriting: ")
                                val newMail = scanner.next()
                                mailArray[index] = newMail
                                println("Email \"$newMail\"ga o'zgardi.")
                            }
                            "6" -> {
                                print("Parolni kiriting: ")
                                val newPassword = scanner.next()
                                passwordArray[index] = newPassword
                                println("Parol \"$newPassword\"ga o'zgardi.")
                            }
                            "7" -> {
                                continue@myloop
                            }
                        }
                    }

                } else println("Bunday foydalanuvchi mavjud emas yoki kiritilgan ma'lumotlar xato!")



            }
            "5" -> {
                var isHave = false
                var index = -1

                print("\"Username\"ni kiriting: ")
                val deletedUser = scanner.next()
                print("Parolni kiriting: ")
                val deletedPassword = scanner.next()

                for (i in 0 until count) {
                    if (usernameArray[i] == deletedUser && passwordArray[i] == deletedPassword) {

                        isHave = true
                        index = i
                        break
                    }
                }

                if (isHave) {
                    nameArray[index] = null
                    surnameArray[index] = null
                    ageArray[index] = null
                    usernameArray[index] = null
                    passwordArray[index] = null
                    mailArray[index] = null

                    nameArray[index] = nameArray[index + 1]
                    surnameArray[index] = surnameArray[index + 1]
                    ageArray[index] = ageArray[index + 1]
                    usernameArray[index] = usernameArray[index + 1]
                    passwordArray[index] = passwordArray[index + 1]
                    mailArray[index] = mailArray[index + 1]
                    count--

                    println("Foydalanuvchi ma'lumotlari o'chirildi.")
                } else println("Siz o'chirmoqchi bo'lgan foydalanuvchi topilmadi yoki kiritilgan ma'lumotlar xato!")
            }
            "6" -> {
                var isHave = false
                var index = -1

                print("\"Username\"ni kiriting: ")
                val dataUsername = scanner.next()
                print("Parolni kiriting: ")
                val dataPassword = scanner.next()

                for (i in 0 until count) {
                    if (usernameArray[i] == dataUsername && passwordArray[i] == dataPassword) {


                        isHave = true
                        index = i
                        break
                    }
                }

                if (isHave) {
                    println("""Ism: ${nameArray[index]}
                    Familya: ${surnameArray[index]}
                    Yosh: ${ageArray[index]}
                    Username: ${usernameArray[index]}
                    Parol: ${passwordArray[index]}
                    Email: ${mailArray[index]}
                    """.trimMargin())

                } else println("Ma'lumotlar topilmadi!")

            }
            else -> {
                println("Menyudagi raqamlardan foydalaning!")
            }
        }
    }
}