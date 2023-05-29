/**
 * @author Stanislav Donetc
 * */



fun main() {

    //We are given a string AAABBBBCCCCCCDDDDDDDDDHHHHHHHHHHHHE and at the output we want to get -> A3B4C6D9H12
    println( countLetters("AAABBBBCCCCCCDDDDDDDDDHHHHHHHHHHHHE"))

    }
fun countLetters(input: String): String {
   var currentLetter = input[0]
    var count = 1
    var result = ""

    for (letter in input.substring(1)){
        if (currentLetter == letter){
            count++
        }else{
            if (count == 1)
                result += currentLetter
            else
                result+= "$currentLetter$count"

            count = 1;
            currentLetter = letter
        }
    }


    //Last
    if (count == 1)
        result  += currentLetter
    else
        result+="$currentLetter$count"
    return result

}

/**
 *The countLetters function starts by initializing the currentLetter variable with the first character
 * of the input string input[0]. It also initializes the count variable to 1 to keep track of the consecutive
 * occurrences of the current letter. The result variable is initialized
 * as an empty string to store the compressed string.
 *The function then iterates over the remaining characters of the input string,
 *starting from the second character, using the for (letter in input.substring(1)) loop.
 *For each letter, it compares it with the currentLetter. If they are the same, the count is incremented.
 *If they are different, it means a new letter is encountered, so the previous currentLetter and its count
 *are appended to the result string. If the count is 1, only the currentLetter is appended; otherwise,
 *the currentLetter is appended followed by its count in the format "$currentLetter$count".
 *After the loop, the last letter and its count are appended to the result string using the same logic as above
 *Finally, the result string containing the compressed version of the input string
 *is returned as the output of the function.
 *
 *
 */

