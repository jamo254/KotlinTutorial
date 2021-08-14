# KotlinTutorial
This repo outlines basic concepts in Kotlin such as variable, functions, interfaces and classes.

    1  Built in data types
    2  Numbers
    3  Characters
    4  Booleans
    5  Arrays
    6  Interfaces
    7  Classes - Contructors
     
 

```kotlin
Example of a Kotlin program
//Variables in Kotlin

fun main(arrgs: Array<String>){
   //Strings
    var  languageSpoken = "Swahili"
    val countriesSpoken = 25
    println("${languageSpoken} in ${countriesSpoken} countries" )

    // number - specifying a variable as a numbers allows you to assign integer and float values
    var testingCode: Number = 12.5
    println(testingCode)

    testingCode = 23
    //Int smart casting
    println(testingCode)

    //Long smart cast from number
    testingCode = 1254L
    println(testingCode)

    // Joining Variables
     var size = 340000
     var city = "Moscow"

    println("The size of ${city} is ${size} km squared")

    //In Kotlin Char cannot be assigned numbers unlike Java

    var letter: Char
    letter = 'M'
    println(letter)

    //Boolean data types
    var flag = true
    if (flag != true) {
        println(false)
    } else {
        println(true)
    }

    //Arrays- can be used to store multiple values
    //Creating an array
    // Creates an Array<String> with values ["0", "1", "4", "9", "16"]
    val assigning = Array(5) {i -> ( i * i).toString()}
    assigning.forEach { println(it) }


    //Primitive array types
    val x: IntArray = intArrayOf(4, 2, 3)
    x.forEach { println("Arrays ${it}") }

    //Array of only zeroes
    val arr = IntArray(5)
    arr.forEach {println( it )}

    val arr2 = IntArray(5){ 45 }
    arr2.forEach { print( it ) }


    // e.g. initialise the values in the array using a lambda
   // Array of int of size 5 with values [0, 1, 2, 3, 4] (values initialised to their index value)

    var arr4 = IntArray(5) { it * 1 }
    arr4.forEach { println ( it * 3) }

}

```
