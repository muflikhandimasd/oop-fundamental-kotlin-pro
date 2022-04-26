package fundamental.data

data class Product(val name : String, val price : Int, val category : String)
//data = copy semua property primary constructor

fun main() {
    val product = Product(name = "Indomie", price = 3_000, category = "Food")
    val product2 = product.copy()
    val product3 = product.copy(price = 4_000)
    println(product)
    println(product2)
    println(product3)

}
