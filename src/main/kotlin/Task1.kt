/**
 * @author Stanislav Donetc
 * */


fun main() {
    //given 2 arrays [1,2,3,2,0] and [5, 1, 2, 7, 3, 2]
    //need to return intersection [1, 2, 2, 3] (order is not important)
    val result = intersectionArray(intArrayOf(1, 2, 3, 2, 0), intArrayOf(5, 1, 2, 7, 3, 2))
    println(result)


}

fun intersectionArray(a1: IntArray, a2: IntArray): List<Int> {
    val s1 = a1.toHashSet()
    val s2 = a2.toHashSet()
    val result = mutableListOf<Int>()
    for (el in s1) {
        if (s2.contains(el)) {
            val numOfRepeats = minOf(a1.count { it == el }, a2.count { it == el })
            repeat(numOfRepeats) { result.add(el) }
        }
    }
    return result
}

/**
 *The provided code represents a function named `intersectionArray` that takes two `IntArray` arrays,
 * a1` and `a2`, as input and returns a list of common elements (intersection) between these arrays.

In the code, two hash sets, `s1` and `s2`, are created to store the unique elements from `a1` and `a2`, respectively.
Then, an empty mutable list named `result` is created to store the common elements.

Next, the code iterates over the elements from `s1`. For each element `el`,
it checks if it is also present in `s2` using `contains(el)`. If the element is found in both `s1` and `s2`,
the number of occurrences of that element in `a1` and `a2` is determined using the `count { it == el }` function.
The minimum value between these two counts is stored in the variable `numOfRepeats`.

Then, using the `repeat(numOfRepeats) { result.add(el) }`
function, the element `el` is added to the `result` list `numOfRepeats` times. Thus, if an element appears multiple
times in both `a1` and `a2`, it will be added to the `result` list the corresponding number of times.

Finally, the `result` list containing all the common elements is returned as the output of the function.

In summary, the `intersectionArray` function finds the intersection of two arrays, keeps track of duplicate
elements, and returns a list of common elements.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * */