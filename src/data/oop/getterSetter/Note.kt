package data.oop.getterSetter

class Note(title : String) {
    var tittle = title
        get() {
            println("call getter")
            return field
        }

        set(value) {
            println("call setter")

            if (value.isNotBlank()){
                field = value
            }
        }
}


class BigNote(val title: String){
    val bigTitle:String
        get() = title.toUpperCase()
}