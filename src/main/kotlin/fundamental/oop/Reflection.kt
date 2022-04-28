package fundamental.oop
//
//import fundamental.exception.ValidationException
//
//
////fun validateRequest(request: CreateProductRequest) {
////    if (request.id == "") {
////        throw ValidationException(message = "id is blank")
////    } else if (request.name == "") {
////        throw ValidationException(message = "name is blank")
////    }
////}
////
////fun validateRequest(request: CreateCategoryRequest){
////    if (request.id == "") {
////        throw ValidationException(message = "id is blank")
////    } else if (request.name == "") {
////        throw ValidationException(message = "name is blank")
////    }
////}
//
////WITH REFLECTION
//
//import fundamental.annotations.NotBlank
//import kotlin.reflect.full.findAnnotation
//import kotlin.reflect.full.memberProperties
//
//fun validateRequest(request: Any) {
//    val clazz = request::class
//    val properties = clazz.memberProperties
//
//    // iterate satu satu, lalu cek kalo ada annotation @NotBlank
//    for (property in properties) {
//        if (property.findAnnotation<NotBlank>() != null) {
////            call = ambil property mana
//            val value = property.call(request)
//            when (value) {
//                is String -> {
//                    if ("" == value) {
//                        throw ValidationException("${property.name} is blank")
//                    }
//                }
//            }
//        }
//    }
//}
//
//fun main() {
//    val request = CreateProductRequest("1", "Indomie", 2000)
//    validateRequest(request)
//
//    val request2 = CreateCategoryRequest("F", "")
//    validateRequest(request2)
//}