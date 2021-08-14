

fun main() {
    display("Jam")
    val max = maxNumber(4,4)
    println(max)
    log("You program need BIM plugin")



}

fun display (name: String) {
    val students = arrayOf("Jam", "John", "Amana", "Kaka")

    if(name in students){
        println("welcome $name")
    }else {
        print("Wrong credentials")
    }

}


fun maxNumber(a: Int, b: Int): Int = if(a > b ) a else b

//Default  parameters
fun log(message: String, logLevel: Int = 1){
    println(message + logLevel)
}