package data.oop.companionObject

class Application (val name:String){

    companion object {
        fun hello(name: String){
            println(name.toUpperCase())
        }
    }

}