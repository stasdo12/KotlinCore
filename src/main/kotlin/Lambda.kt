/**
 * @author Stanislav Donetc
 * */


fun main() {


    var a = listOf<Int>(1, 2, 3, 4, 5)
    a.forEach { e -> println(e) }
    println(a.map { e -> e * 2 })
    println(a.filter { e -> e % 2 == 0 })
    println(a.reduce { sum, e -> sum + e }) // sum()
    println(a.sortedByDescending { it })

    println(a.any { it > 10 }) //false
    println(a.all { it < 10 }) //true
    println(a.sum())

    var numbers = listOf<Int>(1, 3, -3, 2, -11)
    var (positive, negative) = numbers.partition { it > 0 }
    println(positive)
    println(negative)


    var result = listOf<String>("a", "b", "ba", "ccc", "ad").groupBy { it.length } // hashMap or LinkedHashMap
    println(result)

}