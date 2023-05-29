/**
 * @author Stanislav Donetc
 * */



fun main() {

    /*
    * Sample Input ["eat", "tea", "tan", "ate", "nat", "bat"]
    * Sample OutPut [["ate","eat", "tea"], ["nat", "tan"], ["bat"]]
    * Group by common letters
    * */

   println(commonLetters(arrayOf("eat", "tea", "tan", "ate", "nat", "bat")))



}

fun commonLetters(words: Array<String>):List<List<String>>{
    var result:MutableList<List<String>> = mutableListOf()
    var map = mutableMapOf<String, MutableList<String>>()

    for (word in words){
        val sortedWord = word.toCharArray().sorted().joinToString("")
        if (map.containsKey(sortedWord))
            map[sortedWord]?.add(word)
        else
            map[sortedWord] = mutableListOf(word)
    }
    for ((key, value ) in map)
        result.add(value)
    return result
}

/*
* The commonLetters function starts by initializing an empty mutable list called result to store the grouped words.
*  It also creates an empty mutable map named map to map the sorted versions of
*  words to lists of words with the same sorted version.

*The function then iterates over each word in the input array using the for (word in words) loop.
* For each word, it sorts the characters of the word into ascending order using toCharArray().sorted(),
*  and then converts the sorted characters back into a string using joinToString("").
* This sorted string serves as a key to group the words.

*If the map already contains the sorted string as a key,
*  it means that there are already words with the same sorted version. In this case,
* the current word is added to the corresponding list of words in the map using map[sortedWord]?.add(word).

*If the map does not contain the sorted string as a key, it means that this is the
* first occurrence of a word with this sorted version. In this case, a new key-value pair
* is added to the map where the key is the sorted string, and the value is a mutable list containing
* the current word using map[sortedWord] = mutableListOf(word).

*After iterating through all the words, the function then loops over the entries
* in the map using for ((key, value) in map). It retrieves each list of words associated with a sorted string and
* adds it to the result list using result.add(value).

*Finally, the result list containing the groups of words based on their common
* letters is returned as the output of the function.
*
* */