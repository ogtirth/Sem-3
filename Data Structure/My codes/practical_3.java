import java.util.Scanner;

public class Main {
  public static void main (String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a character to check if it is vowel or not: ");

    char ch = scanner.next().charAt(0);

    scanner.close();

    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
      System.out.println("The character '"+ ch +"' Is vowel.");
        } else {
      System.out.println("The character '"+ ch +"' Is not vowel.");
        }
  }
}
