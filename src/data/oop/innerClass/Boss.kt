package data.oop.innerClass

class Boss (val boosName:String){
    inner class Employee(val name: String){
        fun hi(){
            println("Hi my name is $name, and my boss name is ${this@Boss.boosName}")
        }
    }
}