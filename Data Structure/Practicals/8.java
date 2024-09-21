// Practical 8: Write a program to check whether a number is prime or not.
// A prime number is a natural number greater than 1 that cannot be formed by multiplying two smaller natural numbers.

import java.util.Scanner; // Import the Scanner class for user input

public class PrimeCheck {
    public static void main(String[] args) {
        
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to check if it is prime: ");
        
        // Read the number value as an integer
        int number = scanner.nextInt();
        
        // Close the scanner object to prevent resource leaks
        scanner.close();

        // Check if the number is prime
        boolean isPrime = true; // Assume the number is prime initially

        // Numbers less than 2 are not prime
        if (number < 2) {
            isPrime = false;
        } else {
            // Check for factors from 2 to the square root of the number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) { // If number is divisible by i, it is not prime
                    isPrime = false;
                    break; // Exit the loop as we found a factor
                }
            }
        }

        // Display whether the number is prime or not
        if (isPrime) {
            System.out.printf("%d is a prime number.%n", number);
        } else {
            System.out.printf("%d is not a prime number.%n", number);
        }
    }
}
