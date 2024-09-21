// Practical 6: Write a program to find the power of a number using a loop.
// The power of a number 'base' raised to 'exponent' is calculated as: base^exponent.
// For example, 2^3 = 2 * 2 * 2 = 8.

import java.util.Scanner;

public class PowerUsingLoop {
    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the base number
        System.out.print("Enter the base number: ");
        // Read the base value as an integer
        int base = scanner.nextInt();

        // Prompt the user to enter the exponent
        System.out.print("Enter the exponent: ");
        // Read the exponent value as an integer
        int exponent = scanner.nextInt();

        // Close the scanner object to prevent resource leaks
        scanner.close();

        // Initialize result variable to 1, since any number raised to the power 0 is 1
        int result = 1;

        // Use a loop to calculate the power
        // Multiply 'result' by 'base' 'exponent' number of times
        for (int i = 1; i <= exponent; i++) {
            result *= base; // result = result * base
        }

        // Display the calculated power of the base raised to the exponent
        System.out.println(base + " raised to the power of " + exponent + " is " + result + ".");
    }
}
