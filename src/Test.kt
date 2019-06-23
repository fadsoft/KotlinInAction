import java.io.BufferedReader
import java.io.StringReader
import java.lang.IllegalArgumentException
import java.util.*

interface Expr

class Num(val value: Int) : Expr

class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e:Expr):Int =
    when  (e){
        is Num ->
            e.value
        is Sum ->
            eval(e.right) + eval(e.left)
        else ->
            throw IllegalArgumentException("Unknown expression!")
    }

fun evalWithLogging(e: Expr): Int =
    when (e) {
        is Num -> {
            println("Num: ${e.value}")
            e.value //This is the last expression in a block and is returned if e is of type Num.
        }
        is Sum -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("Sum1: $left + $right")
            left + right //This expression is returned if e is of type Sum.
        }
        else ->
            throw IllegalArgumentException("Unknown expression")
    }

fun fizzBuzz(i: Int) =
    when{
        i % 15 == 0 -> "FizzBuzz"
        i % 3 == 0 -> "Fizz "
        i % 5 == 0 -> "Buzz "
        else -> "$i"
}




fun main() {
    println(Color.BLUE.rgb())
    println(getMnemonic(Color.BLUE))
    println(getWarmth(Color.ORANGE))

    println(mix(Color.BLUE, Color.YELLOW))

    println(mixOptimized(Color.BLUE, Color.YELLOW))

    val sum = eval(Sum(Sum(Num(1), Num(2)),Num(4)))

    println("The sum of (1+2)+4 is: $sum")

    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))

    for ( i in 1..100){
        print("${fizzBuzz(i)} ")
    }
    println()
    for (i in 100 downTo 1 step 2) {
        print("${fizzBuzz(i)} ")
    }

    println()

    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }
    for ((letter, binary) in binaryReps)
    { println("$letter = $binary")
    }

    val list = arrayListOf("10", "11", "1001")
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }

    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))

}

fun readNumber(reader: BufferedReader): Int? {
    return try {
        val line = reader.readLine()
        Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        null
    } finally {
        reader.close()
    }
}


fun mixOptimized(c1: Color, c2: Color) =
    when {
        (c1 == Color.RED && c2 == Color.YELLOW) ||
                (c1 == Color.YELLOW && c2 == Color.RED) ->
            Color.ORANGE
        (c1 == Color.YELLOW && c2 == Color.BLUE) ||
                (c1 == Color.BLUE && c2 == Color.YELLOW) ->
            Color.GREEN
        (c1 == Color.BLUE && c2 == Color.VIOLET) ||
                (c1 == Color.VIOLET && c2 == Color.BLUE) ->
            Color.INDIGO
        else -> throw Exception("Dirty color")
    }