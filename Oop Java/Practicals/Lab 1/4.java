// Practical: Write a program to get 2 numbers from the user and print the sum using Command Line Arguments.

public class CommandLineSum {
    public static void main(String[] args) {
        // Check if exactly two arguments are passed
        if (args.length == 2) {
            // Convert command line arguments (which are in String format) to integers
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Calculate the sum
            int sum = num1 + num2;

            // Output the sum
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        } else {
            System.out.println("Please provide exactly two numbers as command line arguments.");
        }
    }
}
