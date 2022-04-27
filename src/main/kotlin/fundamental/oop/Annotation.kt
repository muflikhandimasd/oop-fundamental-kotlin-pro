package fundamental.oop

import fundamental.annotations.Fancy

@Fancy(author = "Muflikhan")
class MyApp(val name : String, val version : Int){
    fun info() : String = "Application $name-$version"
}

fun main() {
    val myApp = MyApp("Kotlin", 2)
    println(myApp.info())
}