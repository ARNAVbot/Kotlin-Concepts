//By default, java creates this file with class name = MyFirstFileKt while compiling.
// However, we can change this file name with the following method

@file:JvmName("MyCustomFileName")

import ConstructorClassExample.Person
import ConstructorClassExample.Student

// all high level methods are static.
// by high level , we mean outside of a class.
// hence , the corresponding function in java would be :
// public static void main(Array<String> args)
fun main(args: Array<String>) {
    println("First method calling")
    println(10 - 9)
    println(true)

    val person = Person("Steve")
    person.display()

    val student = Student("Jobs")
    student.display()

    //------------RANGES ----------------------//
    // the following variable contains value from 1 to 3
    val r1 = 1..3
    println(r1)
    for (i in r1)
        println(i)

    // the following variable contains values from 5 to 1
    val r2 = 5 downTo 1

    // the following variable contains values 5,3 and 1
    val r3 = 5 downTo 1 step 2

    // the following variable contains values a, b, c ,d ..... x, y , z
    val r4 = "a".."z"

    val isPresent = "a" in r4
    println(isPresent)

    // the following variable contains values in decreasing order 10,9,8,7....3,2,1
    val countDown = 10.downTo(1)

    // the following variable contains values in increasing order 1,2,3...7,8,9,10
    val moveUp = 1.rangeTo(10)

// ----------------If as an expression----------------------//
    val a = 5
    val b = 3
    val result = if (a > b) {
        println("a is greater")
        a
    } else {
        println("b is greater")
        b
    }
    println("result = $result")


    //-----------------------Switch example----------------------//
    when (result) {
        0, 5 -> {
            println("Hey  , its me")
        }
        in 6..20 -> {
            println("in loop")
        }
        !in 6..20 -> {
            println("in not loop")
        }
        3 -> {
            println("oops")
        }
        else -> {
            println("lost it")
        }
    }

    //------------------Switch as an expression--------------------//
    val result2 = when (result) {
        in 6..20 -> {
            println("in loop")
        }
        !in 6..20 -> {
            println("in not loop")
        }
        3 -> {
            println("oops")
        }
        else -> {
            println("lost it")
        }
    }
    println("result 2 = $result2")

    //-------------breaking out of a NAMED loop-----------------//
    myLoop@ for (i in 1..10) {
        if (i == 5)
            break@myLoop
        println("no = $i")
    }

    println("The greater number is ${max(2,3)}")

}

//------------Function as expression-----------------------//
fun max(a: Int, b: Int): Int = if (a > b) {
    a
} else {
    b
}

//---------------Default params----------------//
@JvmOverloads
fun findVolume(a:Int, b:Int, c:Int = 10): Int {
    var newA = a.random(3)
    // updated syntx for infix functions
    var newB = b randomness 2
    return newA * newB * c
}

//-------------------Extension Function-------------------//
// Extension function are static functions in nature
//extension functions can be added to even ur own custom classes
fun Int.random(a:Int) : Int{
    return a* this
}





//----------------Infix functions------------------
/**
 * Difference b/w infix and extension functions
 * 1. all infix functions are extension functions bt all extension functions are not infix functions
 * 2. infix functions ALWAYS have only 1 param
 * 3. See how the infix functions are called.
 */
infix fun Int.randomness(b: Int): Int {
    return this*b
}