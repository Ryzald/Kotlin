fun main() {
    // Return IF (memperpendek kata return
    fun sayHello(name: String = ""): String {
        return if (name == "") {
            "Hello Bro"
        } else {
            "Hello $name"
        }
    }

    // Return When
    fun sayHello2(name: String = ""): String {
        return when (name) {
            "" -> "Hello Bro"
            else -> "Hello $name"
        }
    }

    // RECURSIVE FUNCTION
    println("recursive function")
    //masih menggunakan looping
    fun factorialLoop(value: Int): Int {
        var result = 1;
        for (i in value downTo 1) {
            result *= i
        }
        return result
    }
    println(factorialLoop(5))

    //menggunakan recursive function

    fun factorialRecursive(value: Int): Int {
        return when (value) {
            1 -> 1
            else -> value * factorialRecursive(value - 1)
        }
    }

    println(factorialRecursive(10))

    // TAIL RECURSIVE FUNCTION (menjadikan recursive funtion menjadi looping biasa)
    // syarat ketika memanggil recursive funtion hanaya functionya sendiri tanpad menggunakan data lain atau ditambahkan operasi lain
//    fun display(value: Int) { (akan stack overflow )
    tailrec fun display(value: Int) {
        println("recursive $value")
        if (value > 0) {
            display(value - 1)
        }
    }
//    display(10000)

    tailrec fun factorialRecursive2(value: Int, total: Int =1): Int {
        return when (value) {
            1 -> total
            else -> factorialRecursive2(value - 1, total * value)
        }
    }

    println(factorialRecursive2(5))
}