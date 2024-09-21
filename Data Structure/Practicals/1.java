// Practical 1: Write a program to calculate the area of a Circle (A = πr^2).
// The formula for the area of a circle is: A = πr²
// where π (pi) is approximately 3.14159 and r is the radius of the circle.

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        
        // Read the radius value as a double
        double radius = scanner.nextDouble();
        
        // Close the scanner object to prevent resource leaks
        scanner.close();

        // Calculate the area of the circle using the formula A = πr²
        // Math.PI is a constant in Java that provides the value of π (pi)
        double area = Math.PI * radius * radius;

        // Display the calculated area of the circle
        System.out.printf("The area of the circle with radius %.2f is %.2f", radius, area);
    }
}
