package data.oop.enumClass

enum class Gender {
    MALE,FEMALE

}


enum class Gender2 (val description : String){
    MALE("male"),
    FEMALE("female");

    fun showDesc(){
        println(description)
    }

}