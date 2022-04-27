package fundamental.oop

inline class Token(val value : String){
    fun toUpper() : String = value.uppercase()
}

fun main() {
    val token = Token("SecretToken")
    println(token.toUpper())
}

