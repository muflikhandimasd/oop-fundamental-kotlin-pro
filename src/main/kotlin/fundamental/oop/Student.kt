package fundamental.oop

class Student(val name : String) {

    fun sayHello(name: String) : Unit{
//        $name akan mereferensikan ke parameter name
//        ${this.name} akan mereferensikan ke property name constructor
        println("Hello $name, my name is ${this.name}")
    }

//    fun sayHello(yourName: String) : Unit{
//        println("Hello $yourName, my name is $name")
//    }
//    fun sayHello(firstName : String, lastName : String){
//        println("Hello $firstName $lastName, my name is $name")
//    }
}