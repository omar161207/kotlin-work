// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(t: Triangle ): Boolean {
        val (first, second, third) = t
        if (first<second+third && second<first+third && third<first+second) {
            return true
        }else{
            return false
        }
    
}

fun triangleArea(t: Triangle): Double {
    if (isValidTriangle(t) == false) {
        throw IllegalArgumentException("The provided side lengths do not form a valid triangle.")
    }
    val (a, b, c) = t
    
    val sp = ((a+b+c)/2)
    val area = sqrt(sp * (sp-a) * (sp-b) * (sp-c))
    
    return area
}
