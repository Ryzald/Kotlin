package data.oop.superConstructor

open class Customer (val name:String, val type:String, val balaance: Long){
    constructor(name: String,type: String) : this(name,type,0)
    constructor(name:String) : this(name,"default")
}



class PremiumCustomer: Customer{
    constructor(name: String) : super(name, "default")
    constructor(name: String,balance:Long):super(name,"premium",balance)
}