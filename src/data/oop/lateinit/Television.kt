package data.oop.lateinit

class Television {
    lateinit var brand:String


    fun initTelevision(brand : String){
        this.brand = brand
    }
}