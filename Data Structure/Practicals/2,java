// Practical 2: Write a program to find whether a number is odd or even.
// A number is considered even if it is divisible by 2 without a remainder (i.e., number % 2 == 0).
// If the remainder is not zero (i.e., number % 2 != 0), then the number is odd.

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer number
        System.out.print("Enter a number to check if it is odd or even: ");
        
        // Read the integer input from the user
        int number = scanner.nextInt();
        
        // Close the scanner object to prevent resource leaks
        scanner.close();

        // Check if the number is even by using the modulus operator
        // If the remainder when divided by 2 is zero, the number is even
        if (number % 2 == 0) {
            // Print the result if the number is even
            System.out.println("The number " + number + " is even.");
        } else {
            // Print the result if the number is odd
            System.out.println("The number " + number + " is odd.");
        }
    }
}
