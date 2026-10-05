// Task 4.3: grade calculation using a when expression
import kotlin.system.exitProcess
import kotlin.math.roundToInt

fun main(args: Array<String>){
    if (args.size != 3){
        println("3 grades should be provided")
        exitProcess(1)
    }

    val grade1 = args[0].toDouble()
    val grade2 = args[1].toDouble()
    val grade3 = args[2].toDouble()

    val rounded_average = ((grade1 + grade2 + grade3)/3).roundToInt()

    val grade = when (rounded_average) {
        in 0..39 -> "Fail"
        in 40..69  -> "Pass"
        in 70..100 -> "Distinction"
        else       -> "?"
    }
    println("your rounded average is $rounded_average with a grade of $grade")
}

