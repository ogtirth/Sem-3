// Practical 3: Write a program to determine whether the entered character is a vowel or not.
// Vowels in the English alphabet are: 'a', 'e', 'i', 'o', 'u' (both lowercase and uppercase).

import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a single character
        System.out.print("Enter a character to check if it is a vowel or not: ");
        
        // Read the character input from the user
        // .charAt(0) is used to get the first character of the input string
        char ch = scanner.next().charAt(0);
        
        // Close the scanner object to prevent resource leaks
        scanner.close();

        // Check if the entered character is a vowel (both lowercase and uppercase)
        // Characters 'a', 'e', 'i', 'o', 'u' and their uppercase counterparts are vowels
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            
            // If the condition is true, the character is a vowel
            System.out.println("The character '" + ch + "' is a vowel.");
        } else {
            
            // If the condition is false, the character is not a vowel
            System.out.println("The character '" + ch + "' is not a vowel.");
        }
    }
}
