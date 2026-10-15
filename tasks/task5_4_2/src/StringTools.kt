// Task 5.4.2: String extensions

val Int.isTooLong: Boolean get() = this > 20 

/* 
fun Int.isTooLong() = this > 20 (and call the function in the main.kt) or 
val Int.isTooLong: Boolean get() = this > 20 (and no need to call the function and you have returned a t or f )
*/