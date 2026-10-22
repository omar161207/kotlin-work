// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 1){
        println("You need to provide 1 filename")
        exitProcess(1)
    }
    val first = args[0]
    
    val data = fetchData(first)
    
    val lowest_temp = data.minBy { it.second }
    val highest_temp = data.maxBy { it.second }

    println("Coldest: ${lowest_temp.first} at ${lowest_temp.second}")
    println("Warmest: ${highest_temp.first} at ${highest_temp.second}")

    val av_temp = averageTemp(data)
    println("the average temperature of the list is ${"%.2f".format(av_temp)}")

    // -----------OR----------------

    println("Average: ${"%.2f".format(data.map { it.second }.average())}")
