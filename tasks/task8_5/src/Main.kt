// Task 8.5: example of using a higher-order function

fun main() {
    // Add your testing code here
    val text = "hello world"

    val vowelCount = text.howMany {it.lowercase() in "aeiou"}
    val vowelCount1 = text.count {it.lowercase() in "aeiou"}
    println(vowelCount)
    println(vowelCount1)
}
