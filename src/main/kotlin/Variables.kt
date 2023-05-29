/**
 * @author Stanislav Donetc
 * */


fun main() {

    //String
    //Immutable val (Error name = "Bob2")
    val test1: String = "Bob";
    //Kotlin can anticipate the type, but we can not write type
    val test2 = "Hello"
    //Mutable var
    var test3: String = "Steven";
    test3 = "new Steven"
    //Instead concatenation java
    println("Value of test1  $test1  Value of test2  $test2 Value of test3 $test3")
    //----------------------------------------


    val test4: Int = 123;
    var test5: Int = 123;
    val test6 = 123;
    var test7 = 123;
    println("Value of test4 $test4, Value of test5 $test5, Value of test6 $test6, Value of test7 $test7")

    //Also we can use a Kotlin Code format
    println("Value of test ${test4 + test6}")
    println("Sum is ${2+2}")
}