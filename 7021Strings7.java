import java.util.Scanner;

 class prog7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the original string
        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();

        // Get the characters to add
        System.out.print("Enter the characters to add: ");
        String charactersToAdd = scanner.nextLine();

        // Call the function to add characters
        String resultString = addCharacters(originalString, charactersToAdd);

        // Display the result
        System.out.println("Resulting String: " + resultString);

        // Close the scanner
        scanner.close();
    }

    // Function to add characters to a string
    private static String addCharacters(String originalString, String charactersToAdd) {
        // Create a StringBuilder with the original string
        StringBuilder stringBuilder = new StringBuilder(originalString);

        // Append the characters to add
        stringBuilder.append(charactersToAdd);

        // Return the modified string
        return stringBuilder.toString();
    }
}
