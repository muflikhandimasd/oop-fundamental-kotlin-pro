package fundamental.annotations

@Target(AnnotationTarget.FIELD,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.VALUE_PARAMETER
)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Beta()

class ExampleTarget(@field:Beta val firstName : String,
                    @get:Beta val middleName : String,
                    @param:Beta val lastName : String)
