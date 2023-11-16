// Write a Java program that reads a file and throws an exception if the file is empty.
import java.io.*;

class FileEmptyException extends Exception {
    public FileEmptyException(String message) {
        super(message);
    }
}

public class FileReadingExample {
    public static void main(String[] args) {
        String filePath = "Desktop/file.txt";

        try {
            checkFileNotEmpty(filePath);
            readFromFile(filePath);
        } catch (FileEmptyException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        }
    }

    public static void checkFileNotEmpty(String filePath) throws FileEmptyException, IOException {
        File file = new File(filePath);

        if (!file.exists() || file.length() == 0) {
            throw new FileEmptyException("File is empty or does not exist.");
        }
    }

    public static void readFromFile(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line); // Print each line of the file
        }

        bufferedReader.close();
        fileReader.close();
    }
}
