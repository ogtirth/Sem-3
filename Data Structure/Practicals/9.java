// Practical 9: Write a program to convert seconds into hours, minutes, and seconds.
// The program will take an input in seconds and output it in the format HH:MM:SS.

import java.util.Scanner; // Import the Scanner class for user input

public class SecondsConverter {
    public static void main(String[] args) {
        
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of seconds
        System.out.print("Enter the number of seconds: ");
        
        // Read the seconds value as an integer
        int totalSeconds = scanner.nextInt();
        
        // Close the scanner object to prevent resource leaks
        scanner.close();

        // Calculate hours, minutes, and remaining seconds
        int hours = totalSeconds / 3600; // 1 hour = 3600 seconds
        int minutes = (totalSeconds % 3600) / 60; // Remaining seconds divided by 60 gives minutes
        int seconds = totalSeconds % 60; // Remaining seconds after extracting hours and minutes

        // Display the result in HH:MM:SS format
        System.out.printf("%d seconds is equal to %02d:%02d:%02d (HH:MM:SS)%n", totalSeconds, hours, minutes, seconds);
    }
}
