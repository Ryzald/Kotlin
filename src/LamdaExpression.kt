fun toUpper(value:String):String = value.toUpperCase()

fun main() {
    // lamda expression adalah function yang tidak memiliki nama
//    (String) <tipedat> -> string <return> firstName dll <parameter> -> value <body>
    val lamdaName: (String, String) -> String = { firstName, lastName ->
        val result = "$firstName $lastName"
        result
    }


    val nama = lamdaName("rizal", "wahyu")
    println(nama)

    println("menggunakan IT")
// IT lamba jika terdapat satu poaramater maka dapat menggunkan IT ( jika hanya ada satu parameter

    val sayHello: (String) -> String = {
        "Hello $it"
    }

    println(sayHello("Rizaldi"))

// METHOD REFERENCES (membuat lambda dare class referensi yang sudah ada)
    println("menggunakan method references")
    val toUpperLamda:(String)->String = ::toUpper
    println(toUpperLamda("Upper lambda"))

}
