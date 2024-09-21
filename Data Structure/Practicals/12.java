// Practical 12: Write a program to print Armstrong numbers from 1 to 1000.
// An Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits.

public class ArmstrongNumbers {
    public static void main(String[] args) {
        
        // Iterate through numbers from 1 to 1000
        for (int number = 1; number <= 1000; number++) {
            // Convert the number to a string to find the number of digits
            String numStr = String.valueOf(number);
            int numDigits = numStr.length(); // Number of digits in the current number
            int sum = 0; // Initialize sum for Armstrong check

            // Calculate the sum of digits raised to the power of numDigits
            for (char digitChar : numStr.toCharArray()) {
                int digit = Character.getNumericValue(digitChar); // Convert char to int
                sum += Math.pow(digit, numDigits); // Add the power of the digit to sum
            }

            // Check if the number is an Armstrong number
            if (sum == number) {
                // Print the Armstrong number
                System.out.printf("%d is an Armstrong number.%n", number);
            }
        }
    }
}
