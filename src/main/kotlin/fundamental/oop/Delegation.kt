package fundamental.oop

interface Base{
    fun sayHello4(name : String) : Unit
}

class MyBase : Base{
    override fun sayHello4(name: String) {
        println("Hello $name")
    }
}

class Delegate(val base: Base) : Base by base{
    override fun sayHello4(name: String) {
        println("Hello Delegate $name")
    }
}

fun main() {
    val myBase = MyBase()
    val delegate = Delegate(myBase)
    delegate.sayHello4("Muf")
}
