package app.OOP

import data.oop.abstrac.City
import data.oop.abstrac.Country

fun main() {
    val city = City("Sidoarjo")
    val country = Country("Indonesia")



    println(city.name)
    println(country.name)
}