/*Enter the string from user using BufferedStreamReader */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InputOutput {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter a string: ");
            String userInput = reader.readLine(); // Reading the user input

            System.out.println("You entered: " + userInput);
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        } finally {
            try {
                reader.close(); // Closing the reader
            } catch (IOException e) {
                System.err.println("Error closing reader: " + e.getMessage());
            }
        }
    }
}
