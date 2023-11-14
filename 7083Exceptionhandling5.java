import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class File_Check {
  public static void main(String x[] ) {
    try {
      check_Empty("test1.txt");
      System.out.println("File is not empty.");
    } catch (FileNotFoundException e) {
      System.out.println("Error: " + e.getMessage());
    } catch (EmptyFileException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  static void check_Empty(String fname) throws FileNotFoundException, EmptyFileException {
    File file = new File(fname);
    Scanner scanner = new Scanner(file);

    if (!scanner.hasNextLine()) {
      scanner.close();
      throw new EmptyFileException("File is empty.");
    }

    scanner.close();
  }
}

class EmptyFileException extends Exception {
  EmptyFileException(String message) {
    super(message);
  }
}