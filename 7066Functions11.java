import java.util.Scanner;
public class ConsecutiveChecker {
    public static boolean areConsecutive(int num1, int num2, int num3) {
        // Check if the numbers are consecutive
        return (num1 == num2 - 1 && num2 == num3 - 1) || (num1 == num2 + 1 && num2 == num3 + 1);
    }
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Get input from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        // Close the scanner to prevent resource leak
        scanner.close();
        // Check if the numbers are consecutive
        boolean result = areConsecutive(num1, num2, num3);
        // Display the result
        System.out.println("Are the numbers consecutive? " + result);
    }
}
