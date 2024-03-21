package app.generic

import data.generic.genericFunction.Function


fun main() {
    val function = Function("Eko")

    function.sayHello("Rizaldi")
    function.sayHello<String>("Rizaldi")

    function.sayHello(100)
    function.sayHello<Int>(98)

}