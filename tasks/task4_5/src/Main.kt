// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1){
        exitProcess(1)
    }
    val user_lim = args[0].toLong() // can do int instead of long but puting in mind that the user can enter a very long number int wont handle that 
    var total = 0L

    for (n in 1..user_lim step 2){
        total += n
    }
    println(total)

}
