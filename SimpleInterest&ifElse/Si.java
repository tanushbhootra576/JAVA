// Problem Statement:
// Kenny is tasked with creating a program that calculates the simple interest for a given principal amount, interest rate, and time. Additionally, the program should categorize the calculated interest as "low," "moderate," or "high" based on specific criteria. The program should validate the input to ensure that the interest rate is a non-negative value and provide a clear error message if it's not.

// Input format :
// The first line of input consists of the following input from the user:

// Principal amount (a positive real number).
// Interest rate per annum (a non-negative real number)
// Time period (in years, a positive integer).
// Output format :
// The output should display the message "Invalid input. Please enter a valid positive interest rate." if the provided interest rate is negative.

// If SI is less than 5% of the principal, categorize it as "Interest Category: Low"
// If SI is between 5% and 15% of the principal (inclusive), categorize it as "Interest Category: Moderate"
// If SI is more than 15% of the principal, categorize it as "Interest Category: High"
// Display both the calculated simple interest as "Simple Interest: $<Simple interest>" and its category.



// Code constraints :
// Simple Interest (SI) = (Principal * Rate * Time) / 100.

// Ensure that the interest rate is non-negative (0 or greater).


import java.util.Scanner;

public class Si{
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        System.out.println("Enter principal:");
        double p = s.nextDouble();
        System.out.println("Enter rate:");
        double r = s.nextDouble();
        System.out.println("Enter time:");
        int t = s.nextInt();
     
        s.close();
        
        if (r<0){System.out.printf("Invalid input. Please enter a valid positive interest rate.");return;}
        double si = r*p*t/100;
        double per= si/p*100;
        System.out.printf("Simple Interest: $%.2f\n",si);
        System.out.printf("Interest Category: ");
        if (per<5){System.out.printf("Low");}
        else if (5<per && per<15){System.out.printf("Moderate");}
        else{System.out.printf("High");}
        
    }
    
}