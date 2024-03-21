package data

class Car (paramBrand: String, paramName:String, paramYear:Int?){

    init {
        println("Car $paramBrand dibuat")
    }

    // secondary constructor
    constructor(paramMerk: String, paramName: String) : this(paramMerk,paramName,2020){
        println("Secondary constructor1")
    }

    constructor(paramBrand: String) :this(paramBrand,""){

        println("Secondary constructor 2")
    }



    var brand = paramBrand
    var name: String = paramName
    var year = paramYear

}