package fundamental.oop

abstract class Location(val name : String)
class City(name: String) : Location(name)

fun main() {
    val city = City("Tulungagung")
//    val location = Location("Earth")
}
