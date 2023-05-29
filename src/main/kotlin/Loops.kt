/**
 * @author Stanislav Donetc
 * */


fun main() {

    //for each

    val items = listOf<String>("apple", "orange", "banana") //List.of()Java 9 Immutable
    //If we want mutable we need to user
    var items2 = mutableListOf<String>("apple", "orange", "banana")

    //for each
    for (item in items)
        println(item)

    println("--------")

    for (item in items2)
        println(item)

    //while
    println("--------")
    var index = 0

    while (index < items.size){
        println("Item at $index is ${items[index]}")
        index++
    }


    //Range
    println("--------")
    println(5 in 3..10)

    println("--------")
    for (i in 1..10)
        println(i)

    println("--------")
    for (i in 1 until 10)
        println(i)

    println("--------")
    for (i in 10 downTo 1)
        println(i)

    println("--------")
    for (i in 0..100 step 10)
        println(i)


}