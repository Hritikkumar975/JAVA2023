import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a long integer: ");
        long number = scanner.nextLong();
        System.out.println("You entered: " + number);
    }
}
