// Task 5.1.1: anagrams() function

infix fun String.anagramOf(other: String): Boolean {
    if (this.length != other.length) {
        return false
    }
    return this.lowercase().toList().sorted() == other.lowercase().toList().sorted()
}