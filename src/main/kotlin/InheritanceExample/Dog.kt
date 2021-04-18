package InheritanceExample

class Dog(var name: String, ears: Int) : Animals(ears) {

    // even field variables can be overiden too
    override val color: String
        get() = super.color

    fun move() {
        println("I am moving")
    }

    override fun bark() {
        // the following super call can be eliminated in case we dont want it
        // The animals in bracket is used to avoid confusion.
        // lets say Dog class inherits some inheritance class as well and that inheritance class has the same method name, bark.
        // then in order to distinguish between the 2 , the super with Parent class name tells us , that this method is from the
        // super class and not the inherited class
        super<Animals>.bark()
        println("Dog is brrking.")
    }
}