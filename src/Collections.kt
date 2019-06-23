
fun main(){
    val strings = listOf("first", "second", "fourteenth")
    val numbers = setOf(1, 14, 2)

    println(strings.last())
    println(numbers.max())

    val list = listOf(1, 2, 3)
    println(list)

    println(joinToString(list, ";", "(", ")"))
}

fun <T> joinToString(collection: Collection<T>, separator: String, prefix: String, postfix: String): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()

}