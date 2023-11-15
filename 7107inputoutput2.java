//Enter the string from user using BufferedStreamReader

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class UserInputExample {
    public static void main(String[] args) {
        // Create BufferedReader object to read from the console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Prompt the user to enter a string
            System.out.print("Enter a string: ");

            // Read the input string from the user
            String userInput = reader.readLine();

            // Display the entered string
            System.out.println("You entered: " + userInput);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the BufferedReader
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
