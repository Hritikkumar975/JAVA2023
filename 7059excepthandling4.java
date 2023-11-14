import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class PositiveNumberException {

    public static void main(String[] args) {
        try {
            File file = new File("numbers.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                int number = scanner.nextInt();
                if (number > 0) {
                    throw new Exception("Positive number found: " + number);
                }
            }

            System.out.println("No positive numbers found.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
