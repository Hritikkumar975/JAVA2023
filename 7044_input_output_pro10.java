// Program no. : input / output 10
// Program name : Get all characters from the file, count number of lines, words, characters and display on the screen

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class FileRead {
    public static void main(String[] args) {

        System.out.println("Enter the file path  , Example : 7044_input_output_pro6.java");
        Scanner input = new Scanner(System.in);
        String file_path = input.nextLine();

        try {

            BufferedReader br = new BufferedReader(new FileReader(file_path));

            int num_of_lines = 0;
            int num_of_words = 0;
            int num_of_chars = 0;
            String line;

            while ((line = br.readLine()) != null) {
                num_of_lines++;
                String[] words = line.split("\\s+");
                num_of_words += words.length;
                num_of_chars += line.length();
            }

            System.out.println("Number of lines: " + num_of_lines);
            System.out.println("Number of words: " + num_of_words);
            System.out.println("Number of characters: " + num_of_chars);

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
