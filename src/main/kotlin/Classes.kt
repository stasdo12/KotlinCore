/**
 * @author Stanislav Donetc
 * */


fun main() {

    val child = Person("Child", "Child", 1)
    val p1 = Person("Bob", "Jones",35, child)
    println(p1.firstName)
    println(p1.lastName)
    println(p1.age)

    val rectangle = Rectangle(4.0, 2.0)
    println("The perimeter is ${rectangle.perimetr}")
    println("The area is ${rectangle.area()}")

    val rectangle2 = Rectangle(4.0, 2.0)
    println(rectangle == rectangle2)//true because we use data



}
//Primary Constructor (val firstName:String, val lastName:String, var age:Int) - Main Constructor
class Person(val firstName:String, val lastName:String, var age:Int){

    var children: MutableList<Person> = mutableListOf() //ArrayList in Java


    init {
        println("Person is created $firstName")
    }

    //Second Constructor we need to call first constructor
    constructor(firstName: String, lastName: String, age: Int, child:Person):
            this(firstName, lastName, age){
    children.add(child)
    }

    //default constructor without argument
    constructor():this("", "", -1)
}
//data - lombok in Java all getters and setters equals, to String and hashcode will be created
data class Rectangle(var height: Double, var length:Double){
    var perimetr = (height + length * 2)

    //getter
    var test = 1
        get()= field + 1
        set(value){
            if (value < 0) println("Negative value")
            field = value
        }

    fun  area() = height * length
}