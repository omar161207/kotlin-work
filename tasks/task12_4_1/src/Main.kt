// Task 12.4.1: main program
fun main() {
    val center = Point(0.0, 0.0)
    val invalidCircle = Circle(center, -5.0)

    println("Area: ${circle.area()}")
    println("Perimeter: ${circle.perimeter()}")

    val testPoint = Point(3.0, 4.0)
    println("Contains point: ${circle contains testPoint}")
}

