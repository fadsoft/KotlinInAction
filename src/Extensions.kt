
val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value) {
        this.setCharAt(length - 1, value)
    }

fun main(){
    println("Kotlin".lastChar())

    val list = arrayListOf(1, 2, 3)
    println(list.joinToString(" "))

    println("Kotlin".lastChar)
    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)

}

fun String.lastChar() = this[this.length - 1]

fun <T> Collection<T>.joinToString(separator: String = ", ",
                                   prefix: String = "",
                                   postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0)
            result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}