fun printWithWords(n : Int) : String {
    when (n) {
        in 1..1000 -> {
            when (n) {
                1000 -> return "тысяча"
                else -> {
                    var result: String = ""
                    when (n / 100) {
                        1 -> result += "сто"
                        2 -> result += "двести"
                        3 -> result += "триста"
                        4 -> result += "четыреста"
                        5 -> result += "пятьсот"
                        6 -> result += "шестьсот"
                        7 -> result += "семьсот"
                        8 -> result += "восемьсот"
                        9 -> result += "девятьсот"
                    }
                    when ((n % 100) / 10) {
                        2 -> result += " двадцать"
                        3 -> result += " тридцать"
                        4 -> result += " сорок"
                        5 -> result += " пятьдесят"
                        6 -> result += " шестьдесят"
                        7 -> result += " семьдесят"
                        8 -> result += " восемьдесят"
                        9 -> result += " девяносто"
                    }
                    if (n % 100 in 10..19) {
                        when (n % 100) {
                            10 -> result += "десять"
                            11 -> result += "одиннадцать"
                            12 -> result += "двенадцать"
                            13 -> result += "тринадцать"
                            14 -> result += "четырнадцать"
                            15 -> result += "пятнадцать"
                            16 -> result += "шестнадцать"
                            17 -> result += "семнадцать"
                            18 -> result += "восемнадцать"
                            19 -> result += "девятнадцать"
                        }
                    } else {
                        when (n % 10) {
                            1 -> result += " один"
                            2 -> result += " два"
                            3 -> result += " три"
                            4 -> result += " четыре"
                            5 -> result += " пять"
                            6 -> result += " шесть"
                            7 -> result += " семь"
                            8 -> result += " восемь"
                            9 -> result += " девять"
                        }
                    }
                    return result.trim()
                }
            }
        }
        else -> throw Exception("Некорректное число!")
    }
}