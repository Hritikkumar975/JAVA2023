import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class inout10 {
    public static void main(String[] args) {
        File fileName = new File("programs.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            int lineCount = 0, wordCount = 0, charCount = 0;

            String line = null;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters: " + charCount);
            reader.close();
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}