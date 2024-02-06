fun main() {
    try {
        println("Введите первый член:")
        var first = readLine()?.toInt()
        println("Введите пятый член:")
        var fifth = readLine()?.toInt()
        if (first != null && fifth != null) {
            println("Введите номер члена прогрессии (N):")
            var n = readLine()?.toInt()
            if (n != null) {
                when {
                    n == 1 -> println("Значение первого члена прогрессии: $first")
                    n == 5 -> println("Значение пятого члена прогрессии: $fifth")
                    n > 5 -> {
                        val d = (fifth - first) / 4
                        val nth = first + (n - 1) * d
                        val sum = (n / 2) * (first + nth)
                        println("Значение $n-го члена прогрессии: $nth")
                        println("Сумма $n членов: $sum")
                    }else -> println("Член прогрессии с номером $n не существует")
                }
            }
        }
    }catch (e:Exception)  {}
}


