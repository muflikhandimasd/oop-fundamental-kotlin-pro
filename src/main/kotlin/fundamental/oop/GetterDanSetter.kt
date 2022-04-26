package fundamental.oop

class Note( title : String) {
    var title : String = title
    get() {
        println("Call getter function")
        return field
    }
    set(value) {
        println("Call setter function")
        if (value.isNotBlank()){
            field = value
        } else{
            println("Invalid Title")
        }
    }

}

class BigNote(val title: String){
    val  bigTitle : String
    get() = title.uppercase()
}


fun main() {
    val bigNote = BigNote("Test BIG")
    println(bigNote.title)
    println(bigNote.bigTitle)

    val note = Note("Belajar Kotlin")
    println(note.title)

    note.title = "" //invalid title
    println(note.title)


}
