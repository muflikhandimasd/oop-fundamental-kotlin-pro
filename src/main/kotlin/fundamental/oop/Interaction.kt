package fundamental.oop

interface Interaction {
    val name : String
    fun sayInter(name : String) : Unit{
        println("Inter $name, my name is ${this.name}")
    }
}

interface Go : Interaction{
    fun go() : Unit{
        println("GO!")
    }
}

interface MoveA{
    fun move() = println("MoveA")
}

interface MoveB{
    fun move() = println("MoveB")
}

class Human(override val name: String) : Go, MoveA, MoveB {
    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()
    }
}
