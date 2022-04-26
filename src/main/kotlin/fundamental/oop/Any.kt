package fundamental.oop

class Laptop(val brand : String) : Any() // class Laptop : Any()
class Computer(val brand: String) //class Computer : Any()

fun main() {
    val apple = Laptop("Apple")
    println(apple)
}

