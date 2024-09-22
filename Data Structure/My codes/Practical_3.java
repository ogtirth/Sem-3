import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the number to check if its odd or even:");

    int number = scanner.nextInt();
    scanner.close();

    if (number % 2 == 0) {
      System.out.println("The number is "+ number + " Even");
    } else {
      System.out.println("The number is odd"+ number + " Odd");
    }
  
  }
}
