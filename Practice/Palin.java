// Problem Statement
// Dave used to crack puzzles a lot, but recently he has been having a tough time solving one. The solution to a particular puzzle is related to palindrome. 
// Write a program for Dave to check if only the odd digits in an integer form a palindrome. He should use a 'do-while' loop to solve the same.
// Input format :
// The input consists of an integer N.
// Output format :
// The first line of output prints "Odd digits: " followed by the odd digits of N in reverse order.
// The second line prints one of the following:
// If the odd digits form a palindrome, print "The odd digits form a palindrome."
// Otherwise, print "The odd digits do not form a palindrome."
// Refer to the sample output for formatting specifications.
// Code constraints :
// 1 ≤ N ≤ 109

import java.util.Scanner;

public class Palin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        StringBuilder oddDigits = new StringBuilder();
        int temp = N;

        
        do {
            int digit = temp % 10;
            if (digit % 2 != 0) {
                oddDigits.append(digit);
            }
            temp /= 10;
        } while (temp > 0);

        System.out.print("Odd digits: ");
        System.out.println(oddDigits);

       
        String str = oddDigits.toString();
        String reversed = oddDigits.reverse().toString();

        if (str.equals(reversed)) {
            System.out.println("The odd digits form a palindrome.");
        } else {
            System.out.println("The odd digits do not form a palindrome.");
        }
    }
}
