package fundamental.oop

import fundamental.annotations.NotBlank

data class CreateProductRequest(
    @NotBlank val id: String,
    @NotBlank  val name: String,
    val price: Long
)

data class CreateCategoryRequest(
  @NotBlank  val id: String,
  @NotBlank val name: String
)

