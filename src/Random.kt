import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import kotlin.random.Random

fun main(){
    print("The 3 lucky number are: ")
    for (i in 1..3){
        val number = createRandomInteger(0,9)
        print(number)
    }
    println()

    val time = LocalDateTime.now()
    println("The current Date and Time is: $time")

    var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")
    var formatted = time.format(formatter)
    println("Current Date and Time 1: $formatted")

    formatter = DateTimeFormatter.BASIC_ISO_DATE
    formatted = time.format(formatter)
    println("Current Date and Time 2: $formatted")

    formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
    formatted = time.format(formatter)
    println("Current Date and Time 3: $formatted")

    formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
    formatted = time.format(formatter)
    println("Current Date: $formatted")

    formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)
    formatted = time.format(formatter)
    println("Current Time: $formatted")

}

fun createRandomInteger(min:Int, max:Int):Int{
    val random = Random

    return random.nextInt(max-min+1)+min
}