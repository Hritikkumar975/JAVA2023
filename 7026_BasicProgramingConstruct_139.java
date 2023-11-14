import java.util.Scanner;

public class RoundFloat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept a float value from the user
        System.out.print("Enter a float value: ");
        float inputValue = scanner.nextFloat();

        // Round the float value
        float roundedValue = roundFloat(inputValue);

        // Display the rounded value
        System.out.println("Rounded value: " + roundedValue);

        scanner.close();
    }

    // Method to round a float value
    private static float roundFloat(float value) {
        // Use Math.round() to round the float value to the nearest integer
        long rounded = Math.round(value);
        
        // Convert the rounded value back to float
        return (float) rounded;
    }
}
