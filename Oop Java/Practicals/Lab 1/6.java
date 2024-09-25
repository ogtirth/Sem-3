// Practical: Write a program that prompts the user to enter a letter and checks whether it is a vowel or consonant.

import java.util.Scanner;  // Importing Scanner class for user input

public class VowelOrConsonant {
    public static void main(String[] args) {
        // Create an instance of Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a letter
        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);  // Reads a single character

        // Convert the letter to lowercase to simplify the comparison
        char lowerCaseLetter = Character.toLowerCase(letter);

        // Check if the input is a letter
        if (Character.isLetter(lowerCaseLetter)) {
            // Check if the letter is a vowel
            if (lowerCaseLetter == 'a' || lowerCaseLetter == 'e' || lowerCaseLetter == 'i' ||
                lowerCaseLetter == 'o' || lowerCaseLetter == 'u') {
                System.out.println(letter + " is a vowel.");
            } else {
                System.out.println(letter + " is a consonant.");
            }
        } else {
            System.out.println("Please enter a valid letter.");
        }

        // Closing the scanner object
        scanner.close();
    }
}
