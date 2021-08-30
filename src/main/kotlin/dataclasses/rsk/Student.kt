package dataclasses.rsk


fun main() {
   var kevin = Student(1, "Jones")
   var jones = Student(1, "Jones")

    //Checking whether the classes are equal
    if(kevin == jones){
        println("Equal")
    }else {
        print("Not Equal")
    }
 //Data class providers us with  different functions such as copy
    var newKevin = kevin.copy(name = "Jaklen" )
    println(newKevin)
}



//Implementing the data class
data class Student(val id: Int, val name: String) {

}