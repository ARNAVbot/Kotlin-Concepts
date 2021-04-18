package ConstructorClassExample

// class with constructor-1. Note the difference from class Student.
// Here the name passed in the constructor has to be first set in a class variable
// There the class variable is declared inside the constructor itself

class Person(name: String) {
    val name = name

    fun display() {
        println("Called display for class with constructor and name = $name")
    }
}