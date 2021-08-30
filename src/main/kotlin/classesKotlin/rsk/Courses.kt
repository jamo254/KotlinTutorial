package classesKotlin.rsk

class Course (val Id: Int, val Title: String){}
//using object keywords
object Courses{
    var allCourses = arrayListOf<Course>()
    fun initialize() {
         allCourses.add(Course(1,"Kotlin Fundamentals"))
    }
}