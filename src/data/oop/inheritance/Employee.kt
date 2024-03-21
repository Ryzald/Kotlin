package data.oop.inheritance

open class Employee(val name: String) {

    fun sayHello(name: String){
        println("Hello $name, my name is ${this.name}")
    }
}


//child class
class Manager(name: String) : Employee(name)
class VicePresident(name: String) : Employee(name)
