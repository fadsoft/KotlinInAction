package Date

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.Period


fun main(){

    val date1 = formatDate("30-06-2019", "dd-MM-yyyy", "yyyy-MM-dd")

    val parsedDate = LocalDate.parse(date1)

    val period = Period.of(0, 0, 28)

    val finalDate = parsedDate.plus(period)

    println(finalDate)

}

fun formatDate(date:String, initiaDateFormat:String, endDateFormat:String):String{
    val initiaDate = SimpleDateFormat(initiaDateFormat).parse(date)
    val formatter = SimpleDateFormat(endDateFormat)
    val parsedDate = formatter.format(initiaDate)

    return parsedDate
}
