package geometry.example

import geometry.shapes.createRandomRectangle

fun main(args: Array<String>){

    println("Height: ${createRandomRectangle().height}")
    println("Width: ${createRandomRectangle().width}")
    println("Is it a square?: ${createRandomRectangle().isSqaure}")
}