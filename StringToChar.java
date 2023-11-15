import java.util.Scanner;

public class StringToChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert the string to char array
        char[] charArray = inputString.toCharArray();

        // Display each character of the string
        System.out.println("Characters in the string:");

        for (char ch : charArray) {
            System.out.println(ch);
        }

        // Close the Scanner to prevent resource leak
        scanner.close();
    }
}
