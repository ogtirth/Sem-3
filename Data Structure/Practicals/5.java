// Practical 5: Write a program to find the factorial of a number using recursion.
// Factorial of a number n (denoted as n!) is the product of all positive integers less than or equal to n.
// For example, 5! = 5 × 4 × 3 × 2 × 1 = 120.
// Using recursion, the factorial of n is calculated as: n! = n * (n - 1)!

import java.util.Scanner;

public class FactorialRecursion {

    // Recursive method to calculate the factorial of a number
    // The method calls itself with (n - 1) until it reaches the base case (n = 1)
    static long factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n * factorial(n - 1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a non-negative integer number
        System.out.print("Enter a number to find its factorial: ");
        
        // Read the integer input from the user
        int number = scanner.nextInt();
        
        // Close the scanner object to prevent resource leaks
        scanner.close();

        // Call the recursive method to calculate the factorial
        long result = factorial(number);

        // Display the calculated factorial of the number
        System.out.println("The factorial of " + number + " is " + result + ".");
    }
}
