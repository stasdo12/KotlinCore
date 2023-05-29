/**
 * @author Stanislav Donetc
 * */


fun main() {

    //switch case Java
    testWhen(1)
    testWhen(2)
    testWhen(12)
    testWhen("test")
    testWhen(true)


}

//testWhen(Object object)
fun testWhen(input: Any){
    when(input){
        1 -> println("One")
        2 -> println("Two")
        in 10..20 -> println("from 10 to 20")
        is String -> println("String: length ->  ${input.length}")
        else -> println("Something")
    }
}



/**
 * Java example
 * public void test (Object input){
 * if(input insteadOf Strint)
 * String strInput = (String) input;
 * }
 * if(input insteadOf Integer){
 * Integer intInput = (Integer) input}
 * */