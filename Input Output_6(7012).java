import java.util.Scanner;

public class BooleanInputExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a boolean value
        System.out.print("Enter a boolean (true or false): ");

        // Read the boolean input
        boolean userInput = scanner.nextBoolean();

        // Close the scanner when you're done
        scanner.close();

        // Print the entered boolean value
        System.out.println("You entered: " + userInput);
    }
}
