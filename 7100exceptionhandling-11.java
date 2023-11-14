import java.io.IOException;

class FileHandler {
   
    
    void readFile() throws IOException {
      
        
        throw new IOException("File not found");
    }
}

class ExceptionHandlingExample {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();
        try {
            fileHandler.readFile();
        } catch (IOException e) {
            System.out.println("Caught an IOException: " + e.getMessage());
        }
    }
}
