// Task 5.4.2: main program

import kotlin.system.exitProcess

fun main(args: Array<String>) {

    if (args.size != 1){
        println("Please provide your words char length in numbers")
        exitProcess(1)   
    }

    val n = args[0].toInt()
    when {
        n.isTooLong -> println("$n is more than 20 characters")
        else -> println("$n is less than 20 characters")
    }

}

 