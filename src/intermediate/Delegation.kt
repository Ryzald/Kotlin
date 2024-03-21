package intermediate



interface Base {
    fun sayHello(name :String)
}
class Mybase :Base{
    override fun sayHello(name: String) {
        println("Hello $name")

    }

}

class Delegate (val base :  Base) : Base {
    override fun sayHello(name: String) {
        base.sayHello(name)
    }
}

public class Delegation{







}