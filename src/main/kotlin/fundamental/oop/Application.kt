package fundamental.oop

class Application(val name : String) {
   companion object Utilities2{
        fun hello(name : String) : Unit{
            println("Hello $name")
        }
    }
}

fun main() {
    Application.hello("Muflikhan")
    Application.Utilities2.hello("Muflikhan")
}

