package data.oop.overloading

class Person {
    var firstName=""
    var muddleName:String? = null
    var lastName =""

    fun sayHello(name :String){
        println("Hello $name, my name is $firstName")

    }
    fun sayHello(firstNameParam:String,lastNameParam:String){
        println("Hello $firstNameParam $lastNameParam, My name is ${this.firstName}")
    }






}