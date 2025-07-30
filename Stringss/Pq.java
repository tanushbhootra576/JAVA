// Problem Statement

// Anu is creating a feature for a content filtering system. The system needs to analyze user input and clean up text by removing all vowels while also counting them. This functionality helps in tracking how often vowel sounds are used in different speech patterns.

// Develop a Java program that:

// Accepts a string input,
// Counts the number of vowels,
// Removes all vowels from the string using the StringBuffer class,
// And prints both the vowel count and the new string without vowels.
// Input format :
// The input contains a string representing the word to be analyzed.

// Output format :
// The first line of output prints "Number of vowels: <count>" followed by an integer representing the count of vowels in the string.

// The second line of output prints "String after removing vowels: <modified_string>" followed by a string representing the modified string after removing all vowels.

// Refer to the sample output for formatting specifications.

// Code constraints :
// 1 ≤ Length of the string ≤ 1000

// string contains spaces, upper and lower-case characters.


import java.util.Scanner;

public class Pq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int vowelCount = 0;
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (isVowel(ch)) {
                vowelCount++;
            } else {
                result.append(ch);
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("String after removing vowels: " + result.toString());
    }

    // Helper method to check for vowels
    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}
