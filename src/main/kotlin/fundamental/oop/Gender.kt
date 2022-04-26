package fundamental.oop

enum class Gender(val description : String) {
    MALE("Male"),
    FEMALE("Female");

    fun printDesc(){
        println(description)
    }
}

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    val all : Array<Gender> = Gender.values()
    println(man)
    println(woman)
    println(all)
}