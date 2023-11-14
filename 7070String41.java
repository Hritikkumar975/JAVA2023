// Program to Splitting into a number of sub-strings
// Created by Aryan , Rollno 7070
// Note : In order to compile and run this program , rename it from "7070String41.java" to "String41.java"

import java.util.Arrays;
import java.util.Scanner;

public class String41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Get the delimiter from the user
        System.out.print("Enter the delimiter: ");
        String delimiter = scanner.nextLine();

        // Split the string using the delimiter
        String[] substrings = splitString(inputString, delimiter);

        // Display the result
        System.out.println("Resulting Substrings: " + Arrays.toString(substrings));

        scanner.close();
    }

    private static String[] splitString(String inputString, String delimiter) {
        // Use the split() method to split the string into substrings
        return inputString.split(delimiter);
    }
}
