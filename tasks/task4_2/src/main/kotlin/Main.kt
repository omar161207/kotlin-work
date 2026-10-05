// Task 4.2: use of if and ranges

fun main() {
    println("""    MENU
             a. pepperoni 
             b. margarita
             c. barbeque 
             d. chicken ranch""")

    print("please choose an option of pizza: ")    
    val choice = readln().lowercase() 
    if (choice.length == 1 && choice[0] in 'a'..'d') {
        println("Order Accepted")
    }
    else { 
        println("Invalid Choice")
    }
     

    
}
