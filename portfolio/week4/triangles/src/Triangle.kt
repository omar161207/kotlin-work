// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

class Triangle(
    val sideA: Double,
    val sideB: Double,
    val sideC: Double
) {
    init {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0 ||
            sideA >= sideB + sideC ||
            sideB >= sideA + sideC ||
            sideC >= sideA + sideB
        ) {
            throw IllegalArgumentException(
                "The provided side lengths do not form a valid triangle."
            )
        }
    }

    val perimeter: Double
        get() = sideA + sideB + sideC

    val semiPerimeter: Double
        get() = perimeter / 2

    val area: Double
        get() = sqrt(
            semiPerimeter *
            (semiPerimeter - sideA) *
            (semiPerimeter - sideB) *
            (semiPerimeter - sideC)
        )

    override fun toString(): String {
        return "Triangle($sideA, $sideB, $sideC)"
    }
}

