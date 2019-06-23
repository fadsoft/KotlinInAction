package geometry.shapes

import java.util.*

class Rectangle(val height:Int, val width:Int){
    val isSqaure: Boolean
        get() = height == width
}

fun createRandomRectangle(): Rectangle {
    val random = Random(100)
    return Rectangle(random.nextInt(), random.nextInt())
}