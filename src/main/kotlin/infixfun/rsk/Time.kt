package infixfun.rsk

import java.util.*

fun main() {

}
//Create a class and pass it as a parameter in the interface

interface Time {
    fun setTime(hours: Int, min: Int = 0, secs: Int)

}


//inheritance and override
class YetTime: Time {
    override fun setTime(hours: Int, min: Int, secs: Int){}
}

class KevinTime {
    var hours: Int = 0
    var minute: Int = 0
    var seconds: Int = 0
}
