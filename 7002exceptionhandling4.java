// Write a Java program that reads a list of numbers from a file and throws an exception if any of the numbers are positive 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        try {
            // Create a Scanner object to read from a file
            Scanner scanner = new Scanner(new File("file_to_read.txt"));

            // Loop through the file and check each number
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                // If the number is positive, throw an exception
                if (number > 0) {
                    throw new Exception("Positive number found : "+number);
                }

                // Otherwise, print the number
                System.out.println(number);
            }

            // Close the scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            // Handle the file not found exception
            System.out.println("File not found: " + e.getMessage());
        } catch (Exception e) {
            // Handle the negative number exception
            System.out.println(e.getMessage());
        }
    }
}
