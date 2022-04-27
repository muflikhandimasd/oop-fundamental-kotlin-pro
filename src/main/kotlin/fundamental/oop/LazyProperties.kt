package fundamental.oop

class Lazy{
    val name : String by lazy{
        println("Lazy Call")
        "Muflikhan"
    }
}

fun main() {
    val lazy = Lazy()
    println(lazy.name)
}

