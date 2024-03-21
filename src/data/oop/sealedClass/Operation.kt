package data.oop.sealedClass

sealed class Operation(val name :String)

class Plus : Operation("plus")
class Minus : Operation("minus")


