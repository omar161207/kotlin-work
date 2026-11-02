// Task 12.3.2: demo of Person class with secondary constructor

// Task 12.3.1: demo of secondary constructors

fun main() {
    val p = Person("omar", "2007-12-16")//.apply { isMarried = true} // iso for,at is "YYYY-MM-DD" // and if u want to change the is married you use the apply function to change it bcs its in the body of the functiom 
    println("Name: ${p.name}, Birth: ${p.birth}, Married: ${p.isMarried}")
    

    
}

