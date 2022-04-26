package fundamental.oop

class Teacher(val name : String, private val age : Int){
    private fun teach(){
        println("Teach")
    }
}

fun Teacher?.sayGood(name: String){
    if (this != null){
        println("GoodBye $name, my name is ${this.name}")
    }
}

val Teacher.upperName : String
get() = this.name.uppercase()

fun main() {
    val teacher = Teacher(name = "Roni", 12)
    println(teacher.upperName)
    teacher.sayGood("Doni")
//    teacher.teach() //Error
}
