// INPUT/OUTPUT:- 1.Enter the character from user using InputStreamReader.    By(7058/21).

import java.io.InputStreamReader;
import java.io.IOException;

class isr {
    public static char getChar() throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        int ch = reader.read();
        if (ch == -1) {
            throw new IOException("End of input reached.");
        }
        return (char) ch;
    }

    public static void main(String[] args) throws IOException {
        char ch = getChar();
        System.out.println("You entered the character: " + ch);
    }
}