package fundamental.oop

import fundamental.data.Fruit

fun main() {
    val fruit1 = Fruit(20)
    val fruit2 = Fruit(30)
    val fruit3 = fruit1 + fruit2
    println(fruit3)
    println(fruit3 - Fruit(10))
}