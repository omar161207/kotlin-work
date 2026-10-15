// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(inputFile: String, target: String, mark: Char = 'X'): String{
   val new = mark.toString().repeat(target.length)

   return inputFile.replace(target , new)

}
