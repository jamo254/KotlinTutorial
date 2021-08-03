import com.rsk.Person

fun main(args: Array<String>) {
    println("Hello ")
    //Val - value cannot be changed
    val kevin = Person("Kevin")
    println("Name is ${kevin.Name}")

    //Calling the method
    kevin.display()
    kevin.displayWithLambda(::printName)

}

fun printName(name: String){
    println(name)
}
