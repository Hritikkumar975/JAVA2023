import java.util.Scanner;

public class Input {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a float number: ");
    float number = scanner.nextFloat();

    System.out.println("The number you entered is: " + number);
  }
}