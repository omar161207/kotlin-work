// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    if (args.size != 3){
        exitProcess(1)
    }

    val max_temp = args[1].toFloat()
    val temp_inc = args[2].toFloat()
    var current_temp_c = args[0].toFloat()
    var current_temp_f = args[0].toFloat()

    while (current_temp_c <= max_temp){
        val current_temp_f = (current_temp_c * 1.8f) + 32
        println("%10.1f %10.1f".format(current_temp_c, current_temp_f))
        current_temp_c = current_temp_c + temp_inc
    }

}
