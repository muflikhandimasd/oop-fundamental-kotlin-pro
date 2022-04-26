package fundamental.oop

typealias Pelajar = Student
typealias Murid = Pelajar

typealias StringSupplier = () -> String

fun saySaySay(supplier: StringSupplier){
    println("Hello ${supplier()}")
}

fun main() {
    saySaySay { "Dimas" }

    val pelajar = Pelajar("Muflikhan")
    val murid = Murid("Dimas")


}
