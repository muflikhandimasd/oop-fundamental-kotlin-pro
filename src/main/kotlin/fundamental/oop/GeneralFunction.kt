package fundamental.oop

//fun printObject(any: Any){
//    if (any is Laptop){
//        println("Laptop is ${any.brand}")
//    } else if (any is Computer){
//        println("Computer is ${any.brand}")
//    } else {
//        println(any)
//    }
//}

fun printObject(any: Any){
  when(any){
      is Laptop -> println("Laptop is ${any.brand}")
      is Computer -> println("Computer is ${any.brand}")
      else -> println(any)
  }
}

fun printString(any: Any){
    val value = any as? String
    println(value)
}

fun main() {
    printString("Muflikhan") //Success
    printString(4) // null
}



