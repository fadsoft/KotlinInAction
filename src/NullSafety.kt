
fun main(){

    val x:String? = null
    println(strLenSafe(x))

    println(strLenSafe("abc"))

    println(strLenSafeNullOperator(x))
    println(strLenSafeNullOperator("abc"))

    printAllCaps("i love you")
    printAllCaps(null)

    val ceo = Employee("Da Boss", null)
    val developer = Employee("Bob Smith", ceo)

    println(managerName(developer))

    println(managerName(ceo))

    val person1 = Person2("Dmitry", null)
    println(person1.countryName())

    val address = Address("Elsestr. 47", 80687, "Munich", "Germany")
    val jetbrains = Company("JetBrains", address)
    val person2 = Person2("Dmitry", jetbrains)

    printShippingLabel(person2)

//    printShippingLabel(Person2("Alexey", null))

    //Using late on non-null functions
    var email: String? = "yole@example.com"
    email?.let { sendEmailTo(it) }

    email = null
    email?.let { sendEmailTo(it) }

}

fun strLenSafe(s:String?):Int = s?.length ?: 0

fun strLenSafeNullOperator(s:String?):Int? = s?.length

fun printAllCaps(s: String?) {
    val allCaps: String? = s?.toUpperCase()
    println(allCaps)

}

class Employee(val name: String, val manager: Employee?)

fun managerName(employee: Employee): String? = employee.manager?.name

class Address(val streetAddress: String, val zipCode: Int, val city: String, val country: String)
class Company(val name: String, val address: Address?)
class Person2(val name: String, val company: Company?)

fun Person2.countryName() = company?.address?.country ?: "Unknown"

fun printShippingLabel(person: Person2) {
    val address = person.company?.address
        ?: throw IllegalArgumentException("No address")
    with(address) {
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}

fun sendEmailTo(email: String) {
    println("Sending email to $email")
}