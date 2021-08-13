

fun main() {
  val text = "With   Multiple \t whitespaces"

   println(text.replaceMultipleWhiteSpacesEx())
}

fun replaceMultipleWhiteSpaces(value: String): String {
    var regex = Regex("\\s+")
    return regex.replace(value," ")
}

//Function extension, when you want to replace white spaces once
fun String.replaceMultipleWhiteSpacesEx(): String {
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}