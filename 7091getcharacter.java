import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileStats {
    public static void main(String[] args) {
        String fileName = "gurjeet.txt"; // Replace with the path to your file

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int lines = 0;
            int words = 0;
            int characters = 0;

            String line;
            while ((line = reader.readLine()) != null) {
                lines++;
                characters += line.length();

                // Split the line into words and count them
                String[] wordsArray = line.split("\\s+");
                words += wordsArray.length;
            }

            System.out.println("Number of lines: " + lines);
            System.out.println("Number of words: " + words);
            System.out.println("Number of characters: " + characters);

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
