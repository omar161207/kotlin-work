// Task 12.1: program that uses a Point object
fun main() {

    val p = Point(6.0,7.0)
    //p.x = 1.0

    println(p.x)   // prints 0.0
    println(p.y)   // prints 0.0

    val dist = p.distance() // Methods belong to objects, not the blueprint so call the individual object not the class name 
    println(dist) // prints 5.0

    val p1 = Point(0.0, 0.0)
    val p2 = Point(3.0, 4.0)
    val distance = p1.distanceTo(p2)
    println(distance) // prints 5.0




}
