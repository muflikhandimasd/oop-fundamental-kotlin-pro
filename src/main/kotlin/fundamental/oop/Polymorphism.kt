package fundamental.oop

fun main() {
    var employee = Employee("Muflikhan")
    employee.sayTes("Doni")

    employee = Manager("Dimas")
    employee.sayTes("Rubi")

    employee = VicePresident("Ko")
    employee.sayTes("Li")
}