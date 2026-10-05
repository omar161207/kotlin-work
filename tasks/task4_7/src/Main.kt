// Task 4.7: finding the longest line in a file
import java.nio.file.Path
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        exitProcess(1)
    }

    val filePath = Path(args[0])

    var lineNumber = 0
    var longestLine = 0
    var longestLength = 0

    filePath.useLines { lines ->
        for (line in lines) {
            lineNumber++

            if (line.length > longestLength) {
                longestLength = line.length
                longestLine = lineNumber
            }
        }
    }

    print("Line $longestLine is the longest (length = $longestLength)")
}
