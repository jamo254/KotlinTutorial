

fun main(args: Array<String>){
    val number1 = 34.5
    val number2 = 45.7
    var result: Double
    result = number1 + number2
    println("The results = ${result}")

   // Concatenating Strings
    val begin = "Talk is cheap "
    val middle = "Show me the your code "
    val end    =  "Don't waste my time"
    val combine = begin + middle + end
    println(combine)

    // Assignment  operators
    var  number = 233
    number *= 2
    println(number)

    // Comparison and Equality operators
    val a = 45
    val b = 34
    // use of greater than operator
    var max = if (a > b) {
        println("a is larger than b")
        a
    } else {
        println("b is larger")
        b
    }
    println("The largest number is = ${max}")


    //Logical operators
    val numberOne = 23
    val numberTwo = 34
    val numberThree = 54
    val results: Boolean

    results = (numberOne > numberTwo) && (numberOne > numberThree)
    print(results)

    //In operator
    val nambari =  intArrayOf(1, 2, 3, 5, 5)
    if(5 in nambari){
        println("Nambari contains 5")
    }

    val stringsarray = arrayOf("Jan","Feb", "March", "June")
    if ("Jan" in  stringsarray) {
        println("You are logged in")
    } else {
        println("Wrong password")
    }

    //print all the values
    for(i in stringsarray){
        println(i)
    }

    //Kotlin index accs



}