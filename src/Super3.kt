import kotlin.random.Random
import kotlin.test.assertTrue

fun main() {

    var numbers = arrayListOf<Int>(0,0,0)
    var random = Random(1)
    numbers[0] = randomNumber(0,9)
    numbers[1] = randomNumber(0,9)
    numbers[2] = randomNumber(0,9)

    for (number in numbers){
        print(number)
    }

}

fun randomNumber(min:Int,max:Int):Int{
    val randomInteger = (min..max).shuffled().first()
    assertTrue { randomInteger >= min }
    assertTrue { randomInteger <= max }

    return randomInteger
}

