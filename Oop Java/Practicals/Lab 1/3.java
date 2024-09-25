// Practical: Write a Java program to take user input through Command Line Argument.

public class CommandLineInput {
    public static void main(String[] args) {
        // Check if any command line arguments are passed
        if (args.length > 0) {
            // Loop through all the arguments and print them
            System.out.println("Command Line Arguments are:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        } else {
            System.out.println("No Command Line Arguments provided.");
        }
    }
}

// Practical: Write a Java program to take user input through Scanner class.

import java.util.Scanner;  // Importing Scanner class from java.util package

public class ScannerInput {
    public static void main(String[] args) {
        // Create an instance of Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Taking integer input from user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();  // Reads an integer value

        // Taking string input from user
        System.out.print("Enter your name: ");
        String name = scanner.next();  // Reads a single word as a string

        // Taking floating-point number input from user
        System.out.print("Enter a decimal number: ");
        float decimal = scanner.nextFloat();  // Reads a float value

        // Output the input values
        System.out.println("You entered:");
        System.out.println("Integer: " + number);
        System.out.println("Name: " + name);
        System.out.println("Decimal Number: " + decimal);

        // Closing the scanner object
        scanner.close();
    }
}
