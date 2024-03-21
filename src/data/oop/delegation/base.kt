package data.oop.delegation


interface Base{
    fun sayHello(name:String)
}
class Mybase : Base {
    override fun sayHello(name: String) {
        println("Say Hello to $name")
    }

}

//delegation manual
class MyBaseDelegate(val base :Base) : Base{
    override fun sayHello(name: String) {
        base.sayHello(name)
    }

}
//delegate otomatis
class MyBaseDelegate2(val base: Base) :Base by base

