package data.oop.infix

infix fun String.to(type: String):String{
    if (type == "UP"){
        return this.toUpperCase()
    }else{
        return this.toLowerCase()
    }
}

fun main(){
    val result = "Eko Kurniawan" to "UP"
    println(result)

    val result2 = "Eko Kurniawan" to "LO"
    println(result2)

    val numbers = 100 downTo 10 step 5

    for (number in numbers){
        println(number)
    }
}