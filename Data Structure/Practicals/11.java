// Practical 11: Write a program to find the sum of the series 
// 1 + (1+2) + (1+2+3) + (1+2+3+4) + ... + (1+2+3+...+n).

import java.util.Scanner; // Import the Scanner class for user input

public class SeriesSum {
    public static void main(String[] args) {
        
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of n
        System.out.print("Enter the value of n: ");
        
        // Read the integer value for n
        int n = scanner.nextInt();
        
        // Close the scanner object to prevent resource leaks
        scanner.close();

        // Initialize sum variable to store the total sum
        int totalSum = 0;

        // Calculate the sum of the series
        for (int i = 1; i <= n; i++) {
            // Calculate the sum of the first i natural numbers
            int sumOfI = (i * (i + 1)) / 2; // Using the formula for the sum of the first i numbers
            totalSum += sumOfI; // Add to total sum
        }

        // Display the result
        System.out.printf("The sum of the series is: %d%n", totalSum);
    }
}
