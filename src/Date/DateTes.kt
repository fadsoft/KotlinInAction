package Date

import java.text.SimpleDateFormat
import java.util.*


fun main(){

    val date1 = formatDate("30-06-2019", "dd-MM-yyyy", "yyyy-MM-dd")

//    val parsedDate = LocalDate.parse(date1)
//
//    val period = Period.of(0, 0, 28)
//
//    val finalDate = parsedDate.plus(period)

//    val sdf = SimpleDateFormat("dd-MM-yyyy")
//    val calendar = Calendar.getInstance()
//    calendar.set(calendar.get(Calendar.YEAR))

    println(date1)

}

fun formatDate(date:String, initiaDateFormat:String, endDateFormat:String):String{
    val initialDate = SimpleDateFormat(initiaDateFormat).parse(date)
    val formatter = SimpleDateFormat(endDateFormat)
    val parsedDate = formatter.format(initialDate)

    val splinted = parsedDate.split("-")
    val year = splinted[0].toInt()
    val month = splinted[1].toInt()
    val days = splinted[2].toInt()

    val calendar = Calendar.getInstance()
    calendar.set(year,month-1,days)

    calendar.add(Calendar.DAY_OF_MONTH, 28)

    return formatter.format(calendar.time)

}

