package intermediate

fun main() {
//    FOR LOOPS
    println("FOR LOOPS")

    val names = arrayOf("dono", "rizal", "putra", "rudi", "jono")
    for (name in names) {
        println(name)
    }
// FOR LOOPS using RANGE

    for (index in 0..100) {
        print("$index ")
    }
    println()
    for (index in 0..100 step 2) {
        print("$index ")
    }

// WHILE LOOPS
    var i = 0
    while (i < 10) {
        println("while loops $i")
        i++
    }
    println("Selesai Perulangan")

//DO WHILE
    var j = 1
    do {
        println("j $j")
    } while (j > 10)

// BREAK CONTINUE
    // BREAK =  menghentikan perulangan
    var br = 1
    while (true) {
        println("while ke $br")
        br++
        if (br > 10) {
            break
        }
    }

    // CONTINUE =  SKIP sebuah perulangan
    for (ct in 0..10){
        if (ct % 2 == 0){
            continue
        }
        println("CT ke-$ct")
    }


}