// Task 5.1.2: main program

import kotlin.system.exitProcess

fun main(args: Array<String>) {

    if (args.size == 0){
        rollDie()
        exitProcess(0)
    }

    val die = args[0].toInt()
    rollDie(die)

}
