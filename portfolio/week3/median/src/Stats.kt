// Task 7.7.1: statistics functions
fun median(data: List<Float>): Float {

    require(data.isNotEmpty())
    val sortedData = data.sorted()
    val middle = sortedData.size / 2

    return if (sortedData.size % 2 == 1) {
        sortedData[middle]
    } else {
        (sortedData[middle - 1] + sortedData[middle]) / 2
    }

}

fun displayStats(data: List<Float>) {
    println("Minimum: ${data.minOrNull()}")
    println("Maximum: ${data.maxOrNull()}")
    println("Mean: ${data.average()}")
    println("Median: ${median(data)}")
}
