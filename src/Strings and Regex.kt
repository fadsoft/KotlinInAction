
fun main(){

    parsePath("/Users/yole/kotlin-book/chapter.adoc")

    val kotlinLogo = """| //
                        .|//
                        .|/ \"""
    println(kotlinLogo.trimMargin("."))
}
fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")
    println("Dir: $directory, name: $fileName, ext: $extension")
}