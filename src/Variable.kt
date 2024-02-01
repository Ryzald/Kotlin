// agar data dapat berubah isinya dengan Var
// agar data tidak dapat berubah isinya dengan Val Immutable
fun main() {
    val firstName = "eko"
    val age = 30
//    age = 23

    print(age)
//    Nullable (tidak direkomendasikan)
    var kosong: String? = null //agar diperbolehkan null tipe data ditambahkan tandatanya

    println(kosong)
    println(kosong?.length) //agar tidak error maka diberi tanda tanya "?"
    kosong = "isi"
    println(kosong.length)

    // print const
    println("$APP : $VERSION")


}

// Variable constant (immutable data) diakses untuk global dan biasa diberi nama uppercase untuk menandakan vairable constant
const val APP = "android Sederhana"
const val VERSION = "1.2.3"

