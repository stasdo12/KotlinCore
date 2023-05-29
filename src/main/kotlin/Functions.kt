import java.util.*

/**
 * @author Stanislav Donetc
 * */


fun main() {
    println(testSimple(15, 25))
    println(testString(255))
    println(testNamedArguments(z=1, x=2, y = 3))
    println(testDefaultArguments())
    println(testDefaultArguments(y=15))
    println(testDefaultArguments(10, 10))

    printEvent(1,2,3,4,5,6,7,8)
    println("PrintEven")
    printEvent(*intArrayOf(1,2,3,4,5), 7,8)


}

fun testSimple(x: Int, y:Int ): Int = x + y

fun testString(x: Int): String {
    return  "String is $x"
}


fun testNamedArguments(x:Int, y:Int, z:Int):List<Int>{
    return listOf(x, y, z)

}

//void
fun testDefaultArguments(x: Int = 1, y:Int =2){
    println(x+y)
}

//overload
//Java Example
/**
 * public String foo(String name, int number, boolean toUpperCase){
 * return(toUpperCase ? name.toUpperCase() : name) + number
 * }
 * public String foo(String name, int number){
 * return(name, number, false)
 * }
 * public String foo(String name, boolean toUpperCase){
 * return(name, 42, toUpperCase)
 * }
 *  public String foo(String name){
 * return(name, 42)
 * }
 *
 *
  */

//overload
//Kotlin Example the same function
fun foo(name:String, number:Int =42, toUpperCase: Boolean = false){
    (if (toUpperCase) name.uppercase(Locale.getDefault()) else name) + number;
}

//vararg
fun printEvent(vararg numbers :Int){
    numbers.forEach { e -> if (e % 2==0)
    println(e)
    }
}