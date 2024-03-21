package data

open class Teacher(val name:String) {
    fun teach(){
        println("Teach !")
    }


    protected open fun test(){
        println("Test")
    }

}

class SuperTeacher(name: String) : Teacher(name){

    override public fun test(){
        super.test()
    }
}