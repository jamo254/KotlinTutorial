package classesKotlin.rsk

fun main() {
    var ints = listOf(1,2,3,4,5,6, 7,9,10,14,16)
    var  smallInts = ints.filter {it > 4 } // filtering
    for(i in smallInts) println(i)

    var squaredInts = ints.map { it * it }
    for(i: Int in squaredInts) println(i)

    val smallSquaredInts = ints.
                           filter { it < 5 }.
                           map{it * it}

}