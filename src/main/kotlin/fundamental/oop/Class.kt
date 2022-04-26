package fundamental.oop

//class Person(firstNameParam : String, middleNameParam : String?, lastNameParam : String){
//    var firstName :String = firstNameParam
//    var middleName : String? = middleNameParam
//    var lastName : String = lastNameParam
//
//    constructor(firstName : String, lastName: String) : this(firstName, null, lastName){
////        do something
//    }
//}

//Tanpa Primary Constructor
class Person{
    var firstName :String = ""
    var middleName : String? = null
    var lastName : String = ""

    constructor(firstNameParam : String, lastNameParam : String){
        firstName = firstNameParam
        lastName = lastNameParam
    }

    constructor(firstNameParam : String,middleNameParam : String?, lastNameParam : String){
        firstName = firstNameParam
        middleName = middleNameParam
        lastName = lastNameParam
    }

}

fun main() {
    val muflikhan = Person("Muflikhan", "Dimas", "Dwiprayogi")
    val dono = Person("Dimas", "Good")
    println(muflikhan.firstName)
    println(dono.lastName)
}

