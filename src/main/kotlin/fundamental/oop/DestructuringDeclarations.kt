package fundamental.oop

import fundamental.app.Game
import fundamental.data.Login
import fundamental.data.MinMax

fun minMax(value1 : Int, value2 : Int) : MinMax{
    return when{
        value1 > value2 -> MinMax(value2, value1)
        else -> MinMax(value1, value2)
    }
}

fun login(login: Login, callback : (Login) -> Boolean): Boolean{
    return callback(login)
}

fun main() {
    val game = Game("COD", 5_000)
//    val (name, price) = game
    val name = game.component1()
    val price = game.component2()
    println(name)
    println(price)

//    val result = MinMax(10, 100)
//    val min = result.min
//    val max = result.max

//    Ekstrak data, seakan akan balikannya ada 2
    val (min, max) = MinMax(10, 100)
    println(min)
    println(max)

    val login = Login(username = "Muflikhan", password = "secret")
//    login(login,{login ->
//        login.username == "Muflikhan" && login.password == "secret"
//    })
    login(login) { (username, password) ->
        username == "Muflikhan" && password == "secret"
    }
}
