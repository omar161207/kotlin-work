// Task 5.1.1: main program

fun main(args: Array<String>) {
    val first = args[0]
    val second = args[1]

    if (args[0] anagramOf args[1]) {
        println("${args[0]} and ${args[1]} are anagrams!")
    } else {
        println("${args[0]} and ${args[1]} are not anagrams.")
    }
}
