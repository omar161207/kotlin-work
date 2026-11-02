// Task 12.1: Point class
//class Point (x: Double, y: Double) {
    //var x = x
    //var y = y
//}

//class Point(var x: Double, var y: Double)

import kotlin.math.hypot

class Point(var x: Double, var y: Double) {
    fun distance() = hypot(x, y)
    fun distanceTo(other: Point): Double {
        return hypot(this.x - other.x, this.y - other.y) // this point is the first point p1 and second point is the second one in the bracets p2 val distance = p1.distanceTo(p2)
    }
}
