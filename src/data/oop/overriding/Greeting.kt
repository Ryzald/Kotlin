package data.oop.overriding

open class Greeting(val name:String) {
    open fun sayHello(name: String) {
        println("hello $name, my name is ${this.name}")
    }
}

//overriding
class Older(name: String) : Greeting(name){
    override fun sayHello(name: String) {
        println("hello $name, my name is sensei ${this.name}")
    }
}

