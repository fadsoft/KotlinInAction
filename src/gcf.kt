import kotlin.system.exitProcess

fun main(){
    val x:Int
    val y:Int

    println("Enter two numbers numerator and denominator to find lowest fraction")
    try {
        x = readLine()!!.toInt()
        y = readLine()!!.toInt()

        gcf(x, y)
    } catch (e: Exception) {
        println("Invalid input try again!!")
    }



}

fun gcf(x:Int, y:Int) {

    var t: Int
    var num: Int
    var denum: Int

    if (x != 0 && y != 0) {

        if (x > y) {
            t = x - y

            if (x % t != 0 || y % t != 0){
                num = x
                denum = y
            } else{
                num = x / t
                denum = y /t
            }
        } else {

            t = y - x

            if (x % t != 0 || y % t != 0){
                num = x
                denum = y
            } else{
                num = x / t
                denum = y /t
            }
        }

        println("The lowest fraction of $x/$y is $num/$denum")

    } else if( x == 0) println("X cant be empty please re-enter values")

    else if ( y == 0) println("Y cant be empty please re-enter values")
}