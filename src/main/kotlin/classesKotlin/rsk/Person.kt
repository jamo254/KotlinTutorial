package classesKotlin.rsk

import java.lang.invoke.StringConcatFactory

fun main() {
    var student = Student(8)


}
// You have to make the class open so that it can be inherited
open class Person {
    var firstName:String = " "
    var secondName:String = " "

    open fun getName(): String = "$firstName $secondName"

}
//Constructors
class Student(_id: Int): Person() {
    val id: Int
    init {
        id = _id
    }


    //Collections
    fun enroll(courseName: String){
        val course = Courses.allCourses
            .filter{it.Title == courseName }
            .firstOrNull()
    }
    override fun getName(): String {
     return  " "
    }


}