package data.oop.abstrac

//properties and function
abstract class Animal{
    abstract var name:String
    abstract fun run()
}

open class Cat : Animal() {
    override var name: String = "kucing"
    override fun run() {
        println("Berlari")
    }
}