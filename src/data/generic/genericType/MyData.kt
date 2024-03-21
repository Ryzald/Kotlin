package data.generic.genericType

class MyData<T>(val firsData:T) {

    fun getData():T = firsData

    fun printData(){
        println("Data is $firsData")
    }
}

//Multiple parameter

class MyData2<T,U>(val firstValue : T, val secondValue : U){
    fun getValue1() = firstValue
    fun getValue2() = secondValue

    fun printValue() {
        println("Value is $firstValue and next value is $secondValue")
    }
}

