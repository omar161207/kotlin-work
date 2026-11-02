// Task 13.4: unit tests for Money class

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class MoneyTest : FreeSpec({
    // Write your unit tests here
    
    "Can create a Money" {
        val m = Money(2, 99)
    }
    "Euros and cents are stored correctly" {
        val m = Money(2, 99)

        m.euros shouldBe 2
        m.cents shouldBe 99
    }
    "Invalid cents should throw an exception" {
    
    shouldThrow<IllegalArgumentException> {
        Money(1, 150)
}

    shouldThrow<IllegalArgumentException> {
        Money(1, -5)
}
}
    "€1.50 + €1.00 is €2.50" {
        Money(1, 50) + Money(1, 0) shouldBe Money(2, 50)
}
    "€1.50 + €2.00 is €3.50" {
        Money(1, 50) + Money(2, 0) shouldBe Money(3, 50)
}
    "€1.50 + €0.01 is €1.51" {
        Money(1, 50) + Money(0, 1) shouldBe Money(1, 51)
}

})
