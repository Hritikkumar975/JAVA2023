import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class inputoutput {
    public static void main(String[] args) {
        String fileName = "abc.txt";
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                String[] words = line.split("\\s+");
                wordCount += words.length;
                for (String word : words) {
                    charCount += word.length();
                }
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of characters: " + charCount);
    }
}
