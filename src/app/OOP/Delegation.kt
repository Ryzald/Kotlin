package app.OOP

import data.oop.delegation.MyBaseDelegate
import data.oop.delegation.MyBaseDelegate2
import data.oop.delegation.Mybase

fun main() {
    val gg = Mybase()
    gg.sayHello("rizaldi wahyu")


// delegate manual
    val baseDelegate = MyBaseDelegate(gg)
    baseDelegate.sayHello("joko")

// delegate otomate
    val baseDelegate2 = MyBaseDelegate2(gg)
    baseDelegate2.sayHello("otomatis")
}