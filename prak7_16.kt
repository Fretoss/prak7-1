import kotlin.math.sqrt
fun main() {
   try {
       println("Введите радиус:")
       var r = readLine()!!.toDouble()
       println("Введите тангенс угла наклона:")
       var k = readLine()!!.toDouble()
       var a = 1 + k * k
       var b = 2 * k
       var c = r * r
       var disc = b * b - 4 * a * c
       if (disc == 0.0) {
           var x = -b / (2 * a)
           var y = k * x
           println("Прямая касается окружности в точке ($x, $y)")
       } else if (disc > 0) {
           var x1 = (-b + sqrt(disc)) / (2 * a)
           var x2 = (-b - sqrt(disc)) / (2 * a)
           var y1 = k * x1
           var y2 = k * x2
           println("Точки пересечения прямой и окружности: ($x1, $y1) и ($x2, $y2)")
       } else {
           println("Прямая не пересекает окружность")
       }
   } catch (e:Exception) {}
}
