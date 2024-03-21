package app.OOP

import data.Car

fun main() {
    val avanza = Car("Toyota")
    val almaz = Car("Wuling", "mobil orotan")


    println(avanza.brand)
    println(avanza.year)
    println(almaz.brand)
    println(almaz.year)

}