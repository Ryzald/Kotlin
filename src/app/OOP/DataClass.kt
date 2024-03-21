package app.OOP

import data.oop.dataClass.Product

fun main() {
    val  product = Product("Indomie", 2000, "Food")
    println(product)



    // COPY DATA CLASS
    val product2 = product.copy(name = "supermie")
    println(product2)
}