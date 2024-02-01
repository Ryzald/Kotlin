fun main() {
    // HIGHER ORDER FUNCTION
    fun hello(nama: String, transformer: (String) -> String):String  {
        val nameTransform = transformer(nama)
        return "hello $nameTransform"
    }
    val lambdaUpper= {value: String-> value.toUpperCase()}

    println( hello("rizal",lambdaUpper))
    println(hello("RIZAL", {value: String-> value.toLowerCase()}))

    //TRAILING LAMDA (bentuk lain dari kode pada line 9-10) tujuan meningkatkan readability
    val result1 = hello("RIZAL", {value: String-> value.toLowerCase()}) //belum trailing lamda
    val result2 =    hello("RIZAL") {value: String-> value.toLowerCase()}
}
