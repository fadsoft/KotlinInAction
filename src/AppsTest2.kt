import java.util.*

fun main(){
    var okay: Boolean? = false
    val date = "2017-05-07"
    val dd = Integer.parseInt(date.split("-".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[2])
    val mm = Integer.parseInt(date.split("-".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[1])
    val yyyy = Integer.parseInt(date.split("-".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[0])

//    val instance = Calendar.getInstance()
//    val today = instance.time
//    instance.set(yyyy, mm-1, dd)
//    val dueDate = instance.time
//
//    println("First date : $today")
//    println("Secomd date : $dueDate")
//
//    val x = today.compareTo(dueDate)
//    okay = x >= 0
//    println("Value : $x")
//    println("Okay: $okay")

    val instance = Calendar.getInstance()
    instance.set(yyyy, mm - 1, dd, 6, 0, 0)
    val dueDate = instance.time
    val calendar = Calendar.getInstance()
    calendar.time = dueDate
    println("Date : $dueDate")

    print(calendar.timeInMillis)
}