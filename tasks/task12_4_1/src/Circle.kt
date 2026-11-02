// Task 12.4.1: Circle class
import kotlin.math.PI
import kotlin.math.hypot

class Circle(val centre: Point, val radius: Double) {
    init {
        require(radius > 0.0) { "Radius must be greater than zero" }
    }

    fun area(): Double = PI * radius * radius

    fun perimeter(): Double = 2 * PI * radius

    infix fun contains(p: Point): Boolean {
        val distance = hypot(centre.x - p.x, centre.y - p.y)
        return distance <= radius
    }
}

