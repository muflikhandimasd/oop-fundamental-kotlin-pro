package fundamental.oop

data class Friend(val name : String)

fun sayHellooo(friend: Friend?){
//    if (friend != null){
//        println("Hello ${friend.name}")
//    } else {
//        println("Nama ga boleh null")
//    }

//    println("Hello ${friend?.name}")

//    val name = friend?.name ?: "Friend"

    val name = friend!!.name
    println("Hello $name")
}

fun main() {
    sayHellooo(Friend("Muflikhan"))
    sayHellooo(null) //Error
}

