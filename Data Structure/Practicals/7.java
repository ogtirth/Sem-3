// Practical 7: Write a program to find the factors of a given number.
// A factor of a number is an integer that divides the number completely without leaving a remainder.
// For example, factors of 12 are: 1, 2, 3, 4, 6, 12.

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer number
        System.out.print("Enter a number to find its factors: ");
        
        // Read the integer input from the user
        int number = scanner.nextInt();
        
        // Close the scanner object to prevent resource leaks
        scanner.close();

        // Displaying the factors of the number
        System.out.println("Factors of " + number + " are:");

        // Use a loop to find all factors of the given number
        // A factor is a number that divides the given number completely (remainder is 0)
        for (int i = 1; i <= number; i++) {
            // Check if the current value of 'i' is a factor of 'number'
            if (number % i == 0) {
                // Print the factor
                System.out.println(i);
            }
        }
    }
}
