package app.OOP


import data.oop.enumClass.Gender
import data.oop.enumClass.Gender2

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    val allGender:Array<Gender> = Gender.values()

//    konversi dari string
    val manFromString = Gender.valueOf("MALE")
    val womanFromString :Gender = Gender.valueOf("FEMALE")

    println(man)
    println(manFromString)
    println(woman)
    println(allGender.toList())

//function and properties enum

    println("\n function and properties enum \n")
    val man2 = Gender2.MALE
    man2.showDesc()

}