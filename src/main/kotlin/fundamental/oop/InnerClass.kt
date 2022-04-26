package fundamental.oop

class Boss(val name : String) {
    inner class Employee2(val name : String){
        fun hi(){
            println("Hi i'm $name, and my boss is ${this@Boss.name}")
        }
    }
}

fun main() {
    val muflikhan = Boss("Muflikhan")

    val budi = muflikhan.Employee2("Budi")
    budi.hi()

    val joko = muflikhan.Employee2("Joko")
    joko.hi()
}
