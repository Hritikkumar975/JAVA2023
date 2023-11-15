
import java.util.Scanner;

public class StringToFloat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a float as a string
        System.out.print("Enter a floating-point number as a string: ");
        String floatString = scanner.nextLine();

        try {
            // Convert the string to float using Float.parseFloat()
            float floatValue = Float.parseFloat(floatString);

            // Display the converted float value
            System.out.println("Float Value: " + floatValue);
        } catch (NumberFormatException e) {
            // Handle the case where the entered string is not a valid float
            System.out.println("Error: Invalid floating-point number.");
        } finally {
            // Close the Scanner to prevent resource leak
            scanner.close();
        }
    }
}
