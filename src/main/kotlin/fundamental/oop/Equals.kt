package fundamental.oop

class Company(val name : String){
    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        return when(other){
            is Company -> name == other.name
            else -> false
        }
    }
}

fun main() {
    val company1 = Company("Dim")
    val company2 = Company("Dim")
    println(company1.hashCode() == company2.hashCode())
}

