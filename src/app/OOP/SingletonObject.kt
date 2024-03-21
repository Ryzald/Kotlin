package app.OOP

import data.oop.singletonObject.Aplication
import data.oop.singletonObject.Utilities

fun main() {
    println(Utilities.name)
    println(Utilities.toUpper("rizaldi wahyu saputra"))
    Utilities.name = "ggwop"
    println(Utilities.name)


    // inner object singleton

    println(Aplication.Utilities.toUpper("ggwop"))

}

fun a(): Unit {
        println(Utilities.name)
}

