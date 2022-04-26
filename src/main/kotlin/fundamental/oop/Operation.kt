package fundamental.oop

sealed class Operation(val name : String)
class Plus : Operation("Add")
class Minus : Operation("Minus")

fun operation(value1 : Int, value2 : Int, operation: Operation) : Int{
    return when(operation){
        is Plus -> value1 + value2
        is Minus -> value1 - value2
    }
}