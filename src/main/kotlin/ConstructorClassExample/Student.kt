package ConstructorClassExample

// class with constructor-2. Note the difference from class Person.
// There the name passed in the constructor has to be first set in a class variable
// Here the class variable is declared inside the constructor itself
class Student(val name: String) {

    fun display() {
        println("Called display for class with constructor and name = $name")
    }
}