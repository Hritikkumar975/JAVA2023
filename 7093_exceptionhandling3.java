//Java program to create a method that reads a file and throws an exception if the file is not found

//import various packages anmd their content
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

 class filereading {
  public static void main(String[] args) {
    try { //code where exception can be generated 
      readFile("first1.txt");
    } catch (FileNotFoundException e) { //catch the exception
      System.out.println("Error: " + e.getMessage());
    }
  }

  public static void readFile(String fileName) throws FileNotFoundException { // throws the exception to the try block
    File file = new File(fileName);
    Scanner scanner = new Scanner(file);

    // Read and process the contents of the file
    while (scanner.hasNextLine()) { //read the content of file if file found 
      String line = scanner.nextLine();
      System.out.println(line);
    }

    scanner.close();
  }
}
