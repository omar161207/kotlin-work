// Task 5.1.2: main program

import kotlin.system.exitProcess

fun main(args: Array<String>) {

    if (args.size != 1){
        println("You need to provide 1 number")
        exitProcess(1)
    }

    val die = args[0].toInt()
    rollDie(die)

}
