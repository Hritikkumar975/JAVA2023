import java.io.*;

 class prog1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);

        System.out.print("Enter a character: ");
        char inputChar = (char) reader.read();

        System.out.println("You entered: " + inputChar);
    }
}