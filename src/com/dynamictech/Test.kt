package com.dynamictech

class Fish2(var size:Int, hungry:Boolean){

    var hungry:Boolean = hungry
    init {
        println("The size is: $size")
    }
}

class Fruit(var weight:Double){
    var ecoRating:Int = 3
    get(){
        println("Getter value retrieved")
        return field
    }
    set(value){
        field = if (value < 0) 0 else value
        println("Setter new value assigned $field")
    }
}