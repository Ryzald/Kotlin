package app.OOP

import data.oop.sealedClass.Minus
import data.oop.sealedClass.Operation
import data.oop.sealedClass.Plus

fun operation(value1:Int, value2:Int, operation: Operation): Int{
    return when(operation){
        is Plus -> value1 + value2
        is Minus -> value1 -value2
    }
}

fun main() {
    println(operation(10,20,Minus()))
}