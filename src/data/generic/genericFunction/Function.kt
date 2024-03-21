package data.generic.genericFunction

class Function (val name:String) {
    fun <T> sayHello(param : T){

        println("Hello $param, my name is name")
    }


}