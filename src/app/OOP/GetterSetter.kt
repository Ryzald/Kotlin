package app.OOP

import data.oop.getterSetter.BigNote
import data.oop.getterSetter.Note

class GetterSetter {
}

fun main() {
    val note = Note("belajar Kotlin")
    println(note.tittle)

    note.tittle="kosong"

    println(note.tittle)


    val bigNote = BigNote("Belajar Kotlin")
    println(bigNote.bigTitle)
    println(bigNote.title)


}