package intermediate

//FUNCION
fun helloWorld() {
    println("Hello World")
    println("Belajar Kotlin")
}

//FUNCTION PARAMETER
fun sayHello(firstName: String, lastName: String?) {
    println("Selamat Datang $firstName $lastName")
}

//FUNCTION DEFAULT ARGUMENT
fun hello(firstName: String, lastName: String = "default") {
    println("katakan halo kepada $firstName dan $lastName")
}

// RETURNING FUNCTION tanpa pengembalian data ( void ) didalam kotlin disebut "UNIT" dan penulisan eksplisit UNIT bersifat opsional
fun iniUnit(nama: String?): Unit {
    println("Say To Me")
}

//FUNCTION RETURN TYPE
fun sum(a: Int, b: Int): Int {
    val total = a + b
    return total
}

// SINGLE EXPRESSION FUNTION
fun kaliDua(x: Int, y: Int): Int = x * y
fun menyapa(nama: String?): Unit = println("Haloo perkenalkan saya adalah $nama")

// FUNCTION VAR ARGS PARAMETER mengubah menjadi array dan harus dengan kata kunci "vararg" di sebelah paling kanan atau belakang
fun mean(className: String?, vararg values: Int): String {
    var total = 0.0
    var jumlah = 0
    for (value in values) {
        total += value
        jumlah++
    }
    return "Rata-rata nilai kelas $className adalah ${total / jumlah}"
}

//EXTENSION FUNCTION
fun String.hello(): String = "Halo $this"

//FUNCTION INFIX NOTATION (notasi matematika)
infix fun String.to(type: String): String {
    if (type == "UP") {
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}


fun main() {
    helloWorld()
    sayHello("Rizaldi", "Wahyu")
    hello("rizaldi")
    hello("rizaldi", "saputras")
    iniUnit("rizal")

    println(sum(10, 20))
    var result = sum(10, 9)
    println("Hasil dari penjumlahan 10 dan 9 adalah $result")

    println(kaliDua(2, 3))
    menyapa("rizaldi")

    // FUNCTION VAR ARGS PARAMETER
    println(mean("10 A", 9, 9, 9, 9, 8))

    //EXTENSION FUNCTION
    println("Extension funtion")
    val name = "Eko"
    println(name.hello())
    println("eko".hello())

//    infix function
    var nama = "eko Kurniawan" to "UP"
    println(nama)


}

