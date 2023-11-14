import java.util.Scanner;
public class BooleanInputExample{
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a boolean value
        System.out.print("Enter a boolean value (true or false): ");
        // Read the boolean input from the user
        boolean userInput = scanner.nextBoolean();
        // Display the entered boolean value
        System.out.println("You entered: " + userInput);
        // Close the Scanner to avoid resource leaks
        scanner.close();
    }
}
