package fundamental.oop

open class Employee(val name : String) {
    open fun sayTes(name: String){
        println("Hello $name, my name is ${this.name}")
    }
}

class Manager(name: String) : Employee(name){
        final override fun sayTes(name: String) {
        println("Hello $name, my name is Manager ${this.name}")
    }
}
 class VicePresident(name: String) : Employee(name){
     override fun sayTes(name: String) {
         println("Hello $name, my name is VP ${this.name}")
     }
 }

fun main() {
    val muflikhan = Manager("Muflikhan")
    muflikhan.sayTes("Roni")

    val budi = VicePresident("Budi")
    budi.sayTes("Joko")
}