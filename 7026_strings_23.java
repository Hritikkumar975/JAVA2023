import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string from the user
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        // Find and display the reverse of the string
        String reversedString = reverseString(inputString);
        System.out.println("Reverse of the string: " + reversedString);

        scanner.close();
    }

    // Method to find the reverse of a string
    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();

        // Traverse the input string in reverse order and append each character to the StringBuilder
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }
}
