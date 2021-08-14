package infixfun.rsk

fun main() {
    var h1 = Header("Header1 ")
    var h2 = Header("H2")
    //var h3 = h1.plus(h2) // without using infix
    //print(h3.name)

    //using the infix
    var h3 = h1 plus h2
    println(h3.name)

}


class Header(var name: String) {}

infix fun Header.plus(other: Header): Header {
    return  Header(this.name + other.name)
}