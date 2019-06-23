import java.io.File

fun main(){

    val people = listOf<Person>(Person("Fahadi", 22), Person("Samson", 25),
        Person("Alice", 31), Person("Bob", 29), Person("Carol", 31))
    val maxAge = people.maxBy { it.age }

    val names = people.joinToString(" "){it.name}

    println("Person with maximum age is: $maxAge")

    println("Names: $names")

    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessagesWithPrefix(errors, "Error:")

    val responses = listOf("200 OK", "418 I'm a teapot", "500 Internal Server Error")
    printProblemCounts(responses)

    //You can store or postpone the action of creating an instance of a class using a
    //constructor reference
    val createPerson = ::Person
    val p = createPerson("Alice", 29)
    println(p)

    //Although isAdult isn’t a member of the Person class, you can access it via
    //reference, just as you can access it as a member on an instance: person.isAdult() .
    val predicate = p::isAdult
    println(predicate)

    val adult = people.filter { it.isAdult() }
    println(adult)

    val list = listOf(1, 2, 3, 4)
    println("Even numbers from list: ${list.filter { it % 2 == 0 }}")

    val list2 = listOf(1, 2, 3, 4)
    println("Squares: ${list.map { it * it }}")

    println("Names: ${people.map { it.name }}")
    println("Names: ${Person::name}")

    println("Names of Adults: ${people.filter { it.age > 22 }.map { it.name }}")

    println("Names of Adults: ${people.filter { it.age > 22 }.map(Person::name)}")

    println(people.filter { it.age == people.maxBy(Person::age)?.age })

    val maxAges = people.maxBy(Person::age)?.age
    println(people.filter { it.age == maxAges })

    val numbers = mapOf(0 to "zero", 1 to "one")
    println(numbers.mapValues { it.value.toUpperCase() })

    println(people.groupBy { it.age }.toSortedMap())

    val canBeInClub27 = { p: Person -> p.age <= 27 }
    println(people.count(canBeInClub27))

    println(people.find(canBeInClub27))
    println(people.filter(canBeInClub27))

    //ALL MEMBERS CANBEINCLUB27??
    println(people.all(canBeInClub27))
    //ANY MEMBERS CANBEINCLUB27??
    println(people.any(canBeInClub27))

    val books = listOf(Book("Thursday Next", listOf("Jasper Fforde")), Book("Mort", listOf("Terry Pratchett")),
        Book("Good Omens", listOf("Terry Pratchett", "Neal Gaiman")))
    println(books.flatMap { it.authors }.toSet())
//Lazy perfoming iterations as sequence
    val lazy = people.asSequence().map(Person::name).filter{it.startsWith("A")}.toList()

    println("Lazy sequence: $lazy")

    println(listOf(1, 2, 3, 4).asSequence()
        .map { it * it }.find { it > 3 })

    println(people.asSequence().map(Person::name)
        .filter { it.length < 4 }.toList())//Longer transformation

    println(people.asSequence().filter { it.name.length < 4 }//Shorter transformation
        .map(Person::name).toList())

    val naturalNumbers = generateSequence(0) { it + 1 }

    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }

    println(numbersTo100.sum())

    val file = File("/Users/svtk/.HiddenDir/a.txt")
    println(file.isInsideHiddenDirectory())

    println(alphabet())

    println(alphabet2())


}

data class Person(val name:String, val age:Int)

fun printMessagesWithPrefix(messages: Collection<String>, prefix: String)
    { messages.forEach{
        println("$prefix $it")
        }
    }

fun printProblemCounts(responses: Collection<String>) {

    var clientErrors = 0
    var serverErrors = 0

    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")
}
//Extension of class Person by isAdult
fun Person.isAdult() = age >= 25

class Book(val title: String, val authors: List<String>)

fun File.isInsideHiddenDirectory() =
    generateSequence(this) { it.parentFile }.any { it.isHidden }

fun alphabet() = with(StringBuilder())
{ for (letter in 'A'..'Z') {
    append(letter)
}
    append("\nNow I know the alphabet!")
    toString()
}

fun alphabet2() = buildString{
    for (letter in 'A'..'Z') {
    append(letter)
    }
    append("\nNow I know the alphabet!")
}
