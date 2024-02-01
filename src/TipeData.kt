fun main() {
// String satu baris
    val firstName: String = "eko"
    val lastName: String = "patrio"
//    String lebihd ari satu baris
    val alamat: String = """
        Jalan 
        mangga
       trim indent
    """.trimIndent()
    // trim margin agar bisa satu bari

    var alamat2: String = """
        |jalan
        |Mnagga
        | trim margin
    """.trimMargin()
    println(firstName)
    print(lastName)
    println(alamat)
    println(alamat)

    val fullname: String = "$firstName $lastName"
    val desc: String = "Panjang dari $firstName aadlaah  ${fullname.length} karakter"
    println(desc)

//    TIPE DATA ARRAY
    val members: Array<String> = arrayOf("eko", "bondol")
    println(members[1])
    //  mengubah tipe data array
    members.set(0, "ubah")
    print(members[0])

// TIPE DATA RANGE
    println("TIPE DATA RANGE")
    val range = 0..100  //data turun

    //Operasi range
    println(range)
    println(range.count())
    println(range.first)
    println(range.last)
    println(range.contains(50))
    println(range.contains(500))
    print(range.step)

    val range2 = 100 downTo 1 //100 sampai 1 step turun
    val range3 = 100 downTo 1 step 2 // 100,98 dst sampai 2


}