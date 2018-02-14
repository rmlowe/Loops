package academy.learnprogramming.loops


fun main(args: Array<String>) {

    val range = 1..5

    val charRange = 'a'..'z'
    val stringRange = "ABD".."XYZ"

    println(3 in range)
    println('q' in charRange)
    println("CCC" in stringRange)
    println("CCCCCC" in stringRange)
    println("ZZZZZZ" in stringRange)

    val backwardRange = 5.downTo(1)
    val r = 5..1
    println(5 in r)

}