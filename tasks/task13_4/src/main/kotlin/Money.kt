// Task 13.4: Money class

data class Money(val euros: Int, val cents: Int){

    init {
        require(cents in 0..99)
}
    operator fun plus(other: Money): Money {
        return Money(euros + other.euros, cents + other.cents)

}
}



