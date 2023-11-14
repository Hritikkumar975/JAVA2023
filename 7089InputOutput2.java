import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class prog2 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter a string: ");
        String inputString = br.readLine();

        System.out.println("You entered: " + inputString);
    }
}
