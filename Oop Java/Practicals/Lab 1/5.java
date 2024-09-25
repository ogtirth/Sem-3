// Practical: Write a program that reads a number in meters, converts it to feet, and displays the result.

import java.util.Scanner;  // Importing Scanner class for user input

public class MeterToFeetConverter {
    public static void main(String[] args) {
        // Create an instance of Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a number in meters
        System.out.print("Enter the distance in meters: ");
        double meters = scanner.nextDouble();  // Reads a double value (floating-point)

        // Conversion factor from meters to feet
        // 1 meter = 3.28084 feet
        double feet = meters * 3.28084;

        // Output the result
        System.out.println(meters + " meters is equal to " + feet + " feet.");

        // Closing the scanner object
        scanner.close();
    }
}
