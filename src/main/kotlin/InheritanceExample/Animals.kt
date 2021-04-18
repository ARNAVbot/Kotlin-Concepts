package InheritanceExample

// Normally , a class cannot be inherited by default
// To make a class able to be inherited by other classes, we need to declare this class as open
// Also, by default classes in kotlin are public and final
open class Animals(var ears:Int) {
    open val color: String = "red"

    // to be able to make this method overriden too, we need to declare this as open.
    // otherwise, it is public and final by default, just like a class in kotlin
    open fun bark() {
        println("I am baking")
    }
}