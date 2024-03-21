package app.OOP

import data.oop.innerClass.Boss

fun main() {

//    val employee = Boss.Employee("rizal") //tidak bisa karena employee sudah inner clas
    val boss = Boss("Rizaldi")
    val employee1 = boss.Employee("Joko")
    employee1.hi()


}