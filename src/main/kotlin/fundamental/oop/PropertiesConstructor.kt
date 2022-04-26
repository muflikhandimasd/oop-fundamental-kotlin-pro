package fundamental.oop

class Person2(val firstName : String, val middleName : String? = null, val lastName : String){

}

fun main() {
    val muflikhan = Person2("Muflikhan","Dimas", "Dwiprayogi")
    val joko = Person2(firstName = "Joko", lastName = "Nugroho")
    println(muflikhan)
}