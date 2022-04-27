package fundamental.oop

import kotlin.properties.Delegates

class ObservableProperties(name : String = "Init") {
    var name : String by Delegates.observable(name){
        property, oldValue, newValue ->
        println("${property.name} changed from $oldValue to $newValue")
    }
}

fun main() {
    var ob = ObservableProperties()
    ob.name = "Muflikhan"
    ob.name = "Diubah"
    ob.name = "Ubah Lagi"
    println(ob)
}
