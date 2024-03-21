package app.OOP

import data.oop.anopnymousClass.Action


fun fireAction(action: Action){
    action.action()
}

class SampleAction : Action {
    override fun action() {
        println("This is sample action")
    }

}

fun main() {
// normal
    fireAction(SampleAction())

// anonymous class "object"
    fireAction(object : Action {
        override fun action() {
            println("ini anonymous class")
        }

    })


}