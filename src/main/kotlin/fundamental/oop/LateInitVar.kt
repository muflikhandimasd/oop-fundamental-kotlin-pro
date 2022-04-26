package fundamental.oop

class Television{
    lateinit var brand : String

    fun initTelevision(){
        brand = "Apple"
    }
}

fun main() {
    val tv = Television()
//    println(tv.brand) // Error

    tv.initTelevision()
    println(tv.initTelevision()) // Success
}

