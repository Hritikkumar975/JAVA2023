import java.util.Scanner;

public class FloatInput {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a float
        System.out.print("Enter a floating-point number: ");

        // Read the user input as a float
        try {
            float userInput = scanner.nextFloat();

            // Display the entered float
            System.out.println("You entered: " + userInput);
        } catch (java.util.InputMismatchException e) {
            // Handle the case where the user does not enter a valid float
            System.out.println("Error: Please enter a valid floating-point number.");
        } finally {
            // Close the Scanner to prevent resource leak
            scanner.close();
        }
    }
}
