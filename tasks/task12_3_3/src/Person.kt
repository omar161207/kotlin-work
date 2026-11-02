// Task 12.3.2: Person class with secondary constructor
import kotlinx.datetime.LocalDate

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false

    constructor(name: String, birthStr: String) : this(name, 
            run {
            require(birthStr.isNotBlank()) { "Date cannot be blank" } // we dont check the birth in the init like the name bcs we have to change the type so we check it noe before the type changes 
            LocalDate.parse(birthStr)
        })
    
    init {
        require(name.isNotBlank()) { "Name cannot be blank" }
    }
}

// run is a scope function that runs a block of code and returns its final value

// An init block (initializer block) is a section of code prefixed with the keyword init that runs automatically whenever a new object of the class is created, acting as an extension of the primary constructor.
//You need to check the name inside the init block because it allows you to validate properties immediately upon object creation regardless of which constructor was used (primary or secondary).