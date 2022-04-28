package fundamental.oop

fun main() {
    val student = Student("Muflikhan")

//        Memudahkan untuk ambil objectnya menggunakan lambda dan keyword it
//        println(it.name)
        val result : String = student.let {
            "Student Name is ${it.name}"
        }

    println(result)

    val result2 : String = student.run {
//        run itu sama kaya let, bedanya pake keyword this
        "Student Name is ${this.name}"
    }

    println(result2)

    val result3 : Student = student.apply {
//        kembaliannya Object itu sendiri
//        mirip run
        "Student Name is ${this.name}" //ini diignore
    }

    println(result3)

    val result4 : Student = student.also {
//        Mirip let, balikannya Object
        "Student Name is ${it.name}"
    }
    println(result4)

//    With
    val result5 : String = with(student) {
//        mirip run hanya penulisan beda, balikannya returnanya
        "Student Name is ${this.name}"
    }

    println(result5)
}