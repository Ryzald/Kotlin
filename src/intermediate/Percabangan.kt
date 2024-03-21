package intermediate

fun main() {
//    IF
    println("IF statement")
    val examValue = 90
    if (examValue >= 85) {
        println(" masuk kedalam pengayaan")
    }
// IF ELSE
    println("\n IF ELSE ")
    if (examValue < 85) {
        println("diatas 85")
    } else {
        println("dibawah 85")
    }
// ELSE IF
    if (examValue > 95) {
        println("diatas 85")
    } else if (examValue > 87) {
        println("diatas 87")
    } else {
        println("dibawah 85")
    }
//WHEN ( switch case )
    println("\n WHEN seperti switch case")
    val predikatNilai = 'A'

    when (predikatNilai) {
        'A' -> println("Amat Baik")
        'B' -> {
            println("Baik")
            println("baik tapi anda belajar lagi saja")
        }

        'C' -> println("Cukup")
        'D', 'E' -> println("Kurang")
    }

    //when expression IN
    val hasil = 'A'
    val predikat = arrayOf('A', 'B', 'C')
    when (hasil) {
        in predikat -> println("anda lulus")
        !in predikat -> println("nilai anda kurang belajar lagi")
    }

    //when expression IS
    val name = "rizal"
    when (name){
        is String -> println(" tipe data string")
        !is String -> println("tipe data string")
    }

    // when pengganti if else
    val nilai = 78
    when{
        nilai < 50 -> println("nilai ujian jelek banget")
        nilai < 70 -> println("lumayan baik")
        nilai < 80 -> println("baik")

    }




}