# Core Kotlin Project

This is a Kotlin project that contains various code examples and classes demonstrating different concepts and features of the Kotlin programming language.

## Getting Started

To use this project, follow these steps:

1. Clone the repository to your local machine.
2. Open the project in your preferred Kotlin IDE or editor.
3. Run the `main` function in the desired Kotlin file to see the output of each code example.

## Contents

### Person Class

The `Person` class represents a person with properties such as `firstName`, `lastName`, and `age`. It includes multiple constructors, an `init` block, and a mutable list of children. The class demonstrates primary and secondary constructors, initialization blocks, and the use of a mutable list.

### Rectangle Class

The `Rectangle` class represents a rectangle with properties for `height` and `length`. It includes a calculated property for `perimeter` and a function for calculating the `area`. The class also demonstrates the use of getters and setters.

### Functions

The project includes several examples of different types of functions, such as:

- `testSimple`: A simple function that takes two integers as parameters and returns their sum.
- `testString`: A function that takes an integer as a parameter and returns a string representation of the integer.
- `testNamedArguments`: A function that demonstrates the use of named arguments.
- `testDefaultArguments`: A function that demonstrates the use of default arguments.
- `foo`: An example of function overloading in Kotlin.
- `printEvent`: A function that takes a variable number of integers as parameters and prints the even numbers.

### Collections

The project includes examples of working with collections in Kotlin, such as:

- Examples of working with lists, including iterating over elements, mapping, filtering, reducing, sorting, and checking conditions with `any`, `all`, and `sum`.
- Examples of working with arrays and ranges, including iterating over elements and checking conditions.

### Null Safety

The project includes examples of null safety in Kotlin, such as:

- Examples of working with nullable and non-nullable variables, including the use of the safe call operator (`?.`), the Elvis operator (`?:`), and the not-null assertion operator (`!!`).

### String Compression

The project includes a function named `countLetters` that compresses a string by counting consecutive occurrences of the same letter. For example, the input `"AAABBBBCCCCCCDDDDDDDDDHHHHHHHHHHHHE"` would be compressed to `"A3B4C6D9H12"`. The function demonstrates string manipulation and iteration.

### Grouping Words by Common Letters

The project includes a function named `commonLetters` that groups words based on their common letters. It takes an array of words as input and returns a list of lists, where each inner list contains words with the same letters. The function demonstrates the use of maps and lists to group elements based on common properties.

## Conclusion

This project serves as a reference and learning resource for Kotlin programming. Feel free to explore the code examples and classes to understand the concepts and features of Kotlin better.
