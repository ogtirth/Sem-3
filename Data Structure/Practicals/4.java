// Practical 4: Write a program to find the factorial of a number using a loop.
// Factorial of a number n (denoted as n!) is the product of all positive integers less than or equal to n.
// For example, 5! = 5 × 4 × 3 × 2 × 1 = 120.

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a non-negative integer number
        System.out.print("Enter a number to find its factorial: ");
        
        // Read the integer input from the user
        int number = scanner.nextInt();
        
        // Close the scanner object to prevent resource leaks
        scanner.close();

        // Initialize a variable 'factorial' with the value 1
        // The factorial of 0 is 1, so we start with 1
        long factorial = 1;

        // Use a for loop to calculate the factorial
        // Loop runs from 1 to the entered number (inclusive)
        for (int i = 1; i <= number; i++) {
            // Multiply 'factorial' by the loop variable 'i'
            factorial *= i; // factorial = factorial * i;
        }

        // Display the calculated factorial of the number
        System.out.println("The factorial of " + number + " is " + factorial + ".");
    }
}
