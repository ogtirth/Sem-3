// Practical 10: Write a program to convert a number of days into years, weeks, and days.
// The program will take an input in days and output it in the format of years, weeks, and days.

import java.util.Scanner; // Import the Scanner class for user input

public class DaysConverter {
    public static void main(String[] args) {
        
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of days
        System.out.print("Enter the number of days: ");
        
        // Read the days value as an integer
        int totalDays = scanner.nextInt();
        
        // Close the scanner object to prevent resource leaks
        scanner.close();

        // Calculate years, weeks, and remaining days
        int years = totalDays / 365; // 1 year = 365 days
        int weeks = (totalDays % 365) / 7; // Remaining days divided by 7 gives weeks
        int days = totalDays % 7; // Remaining days after extracting years and weeks

        // Display the result in the format of years, weeks, and days
        System.out.printf("%d days is equal to %d year(s), %d week(s), and %d day(s).%n", totalDays, years, weeks, days);
    }
}
