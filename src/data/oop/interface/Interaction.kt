package data.oop.`interface`

interface Interaction {
    val name :String
    fun sayHello(name:String)
}

interface Go{
    fun go(){
        println("go")
    }
}

class Human(override val name: String):Interaction,Go{

    override fun sayHello(name: String) {
       println("Hello $name, my name is ${this.name}")
    }


}

//inheritance antar interface

interface Go2 : Interaction

//yang bisa di inheritance
//1. intervafe extend interface
//2. class extend interface
//
//yang tidak bisa di inheritanc
//1. interface extend class