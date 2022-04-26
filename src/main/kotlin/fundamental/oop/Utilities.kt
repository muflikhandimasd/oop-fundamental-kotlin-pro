package fundamental.oop

object Utilities {
//    di object gabisa bikin constructor
    val name = "Utilities"
    fun toUp(value : String) : String{
        return value.uppercase()
    }
}

fun main() {
    val result = Utilities.toUp("Muflikhan")
    println(result)
    println(Utilities.name)
}