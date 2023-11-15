import java.util.Scanner;

public class ThrowsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter an integer
            System.out.print("Enter an integer: ");
            int userInput = readInteger(scanner);

            // Display the entered integer
            System.out.println("You entered: " + userInput);
        } catch (NumberFormatException e) {
            // Handle the case where the user does not enter a valid integer
            System.out.println("Error: Please enter a valid integer.");
        } finally {
            // Close the Scanner to prevent resource leak
            scanner.close();
        }
    }

    // Method that declares the use of throws
    private static int readInteger(Scanner scanner) throws NumberFormatException {
        // Read the user input as an integer
        return Integer.parseInt(scanner.nextLine());
    }
}

