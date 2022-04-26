package fundamental.oop

abstract class Animal {
    abstract val name : String
    abstract fun run() : Unit
}

class Cat : Animal(){
    override val name: String = "Cat"
    override fun run() {
        println("$name is Running")
    }
}
