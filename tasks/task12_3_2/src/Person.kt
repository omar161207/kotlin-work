// Task 12.3.2: Person class with secondary constructor
import kotlinx.datetime.LocalDate

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false

    constructor(name: String, birthStr: String) : this(name, LocalDate.parse(birthStr))
}
