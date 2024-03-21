package app.generic

import data.generic.genericType.MyData
import data.generic.genericType.MyData2

fun main() {

//    single
    val myDataString : MyData<String> = MyData<String>("Eko")
    myDataString.firsData
    myDataString.printData()
    
    
    val myDataInt : MyData<Int> = MyData<Int>(10)
    myDataInt.printData()

//    Multiple
    val dataString : MyData2<String, Int> = MyData2<String,Int>("Rizal",120)
    dataString.printValue()

    val dataInt : MyData2<Int, String> = MyData2<Int,String>(105,"Wahyu")
    dataInt.printValue()

}