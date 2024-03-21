package data.oop.singletonObject


object Utilities{
    var name = "my Utilities"
    fun toUpper(value:String):String{
        return value.toUpperCase()
    }
}


//inner object singleton

class Aplication(val Name: String){
    object Utilities{
        fun toUpper(name:String) : String{
            return name.toUpperCase()
        }
    }
}