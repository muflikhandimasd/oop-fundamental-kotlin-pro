package fundamental.oop

interface Action {
    fun action() : Unit
}

fun fireAction(action: Action){
    action.action()
}

fun main() {
    fireAction(object : Action{
        override fun action() {
            println("Action One")
        }
    })
    fireAction(object : Action{
        override fun action() {
            println("Action Two")
        }
    })
}
