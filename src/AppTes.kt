import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.*

fun main(){
    val year = 2019
    val month = 6
    val day = 7
    val hrs = 0
    val mins = 0
    val date1 = Date()
    val date2 = LocalDate.now()
    val calendar = Calendar.getInstance()
    calendar.set(year, month-1, day)
    val date3 = calendar.time

    val temp = Calendar.getInstance()
    val calendar2 = Calendar.getInstance()
    calendar2.set(temp.get(Calendar.YEAR), temp.get(Calendar.MONTH),temp.get(Calendar.DATE))
    val start = calendar2.time
    val dateFormat = SimpleDateFormat("dd-MM-yyyy")
    val date4 = dateFormat.format(start)
    val date5 = temp.time
    val date6 = dateFormat.format(temp.time)

    println("The date1 today is $date1")
    println("The date2 today is $date2")
    println("The date3 today is $date3")
    println("The date4 today is $date4")
    println("The date5 today is $date5")
    println("The date6 today is $date6")


}