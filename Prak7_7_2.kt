import kotlin.math.*

fun main() {
    try {
        println("Введите x:")
        var x = readLine()!!.toDouble()
        println("Введите y:")
        var y = readLine()!!.toDouble()
        println("Введите z:")
        var z = readLine()!!.toDouble()
        var a = (3 + exp(y - 1)) / (1 + x.pow(2) * abs(y - tan(z)))
        var b = 1 + abs(y - x) + ((y - x).pow(2) / 2) + (abs(y - x).pow(3) / 3)
        println("Результаты:")
        println("Ответ: ${String.format("%.2f",a)}")
        println("Ответ: ${String.format("%.2f",b)}")
    }catch (e:Exception){}
}
