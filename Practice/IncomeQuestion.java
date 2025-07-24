// Problem Statement
// Suresh, a tax consultant, assists clients in determining their tax bracket based on their annual income and potential deductions. He wants to create a program that calculates the effective annual income after applying a deduction and determines the tax bracket based on the effective income.
// If the client is eligible for deductions (indicated by Yes/yes), subtract 1,000 from their annual income.
// Based on the effective income after deductions, categorize the tax bracket as follows:
// Low Income: If the effective income is 20,000 or less.
// Middle Income: If the effective income is between 20,001 and 50,000, inclusive.
// High Income: If the effective income exceeds 50,000.
// Can you guide Suresh in writing the program?
// Input format :
// The first line of input consists of a double value, representing the annual income.
// The second line consists of a string, indicating if the client is eligible for deductions, Yes/No.
// Output format :
// The first line of output prints a double value, representing the effective income, rounded off to two decimal places, "Effective Income: <Effective Income>".
// The second line prints the tax brackets "Tax Bracket: <Income Level> Income".

// You are using Java
import java.util.Scanner;

public class IncomeQuestion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine().toLowerCase();
        sc.close();
        double ei=x;
        if (s.equals("yes")){
            // System.out.printf("Abra %s",s);
            ei-=1000;
        }
        System.out.printf("Effective Income: %.2f\n",ei);
        
        if (ei<=20000){System.out.printf("Tax Bracket: Low Income");}
        else if (ei<=50000 && ei>20001){System.out.printf("Tax Bracket: Middle Income");}
        else{System.out.printf("Tax Bracket: High Income");}
        
    }
    
    
}