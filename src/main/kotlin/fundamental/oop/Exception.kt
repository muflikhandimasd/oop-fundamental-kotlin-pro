package fundamental.oop

import fundamental.exception.ValidationException

fun validateAndSayHello( name : String){
    if(name.isBlank()){
        throw ValidationException("Name is Blank")
    } else{
        println("Hello $name")
    }
}

fun main() {
   try {
       validateAndSayHello("Muflikhan")
       validateAndSayHello("")
       println("Program")
   } catch (error : ValidationException){
       println("Terjadi error : ${error.message}")
   } catch (error : NullPointerException){
       println("Error : ${error.message}")
   } finally {
       println("Program Selesai")
   }
}

