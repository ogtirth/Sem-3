import java.util.Scanner;

public class Main {
  public static void main(String[]args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Please entet the radius of the circle: ");

    double radius = scanner.nextDouble();
    double area = Math.PI * radius * radius;

    scanner.close();

    System.out.printf("The area of the circle is: %.2f",area);
  }
}
