// Task 5.2.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {

    if (args.size != 1){
        println("You need to provide 1 radius value")
        exitProcess(1)
    }

    val radius = args[0].toDouble()

    var per = circlePerimeter(radius)

    println("The perimeter for your chosen radius is $per")

}
