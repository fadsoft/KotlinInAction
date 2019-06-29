package Date

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter
import java.util.*

fun main(){
//    var date = LocalDate.now()
//    val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
//    val date1 = LocalDate.parse("12-12-2018", formatter)
//    val date2 = LocalDate.now().format(formatter)
//    val date3 = formatter.format(date)
//
//    println(date)
//    println(date1)
//    println(date2)
//    println(date3)
    //Add two dates
    val period = Period.of(0,0,28)
    val date = LocalDate.now()
    val modifiedDate = date.plus(period)

    //Subtract two dates
    val period2 = Period.of(1,2,3)
    var date1 = LocalDate.of(2018, 6, 25)
    var modifiedDate2 = date1.minus(period2)

    //Between two dates
    var datetest = "28-07-2019"
    var date2 = LocalDate.parse("2018-06-25")
    var date3 = LocalDate.parse("2018-12-25")
    var period3 = Period.between(date2,date3)

    println(date)
    println(modifiedDate)
    println()
    println(date2)
    println(modifiedDate2)
    println()
    println(date2)
    println(date3)
    println(period3.months)
}