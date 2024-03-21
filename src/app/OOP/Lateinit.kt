package app.OOP

import data.oop.lateinit.Television

fun main() {
    val television = Television()

//    println(television.brand) // error

    television.brand = "samsung"
    println(television.brand)




}