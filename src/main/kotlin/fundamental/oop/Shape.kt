package fundamental.oop

//open class Shape {
//    open val corner : Int = -1
//    open fun printName(){
//        println("This is parent class")
//    }
//}

//class Rectangle : Shape(){
//    override val corner: Int = 4
////    super = mereferensikan ke class parent
//    val parentCorner : Int = super.corner
//
//    override fun printName() {
//        println("This is rectangle, child class")
////        super = mereferensikan ke class parent
//        super.printName()
//    }
//}

open class Shape(val name : String, val shape : Int, val color : String){
    constructor(name: String, shape: Int) : this(name,shape, "")
    constructor(name: String) : this(name, -1)
}

class Rectangle : Shape{
//    keyword super : mereferensikan ke class parent
    constructor() : super("Rectangle", 4)
    constructor(color: String) : super("Rectangle", 4, color)
}

