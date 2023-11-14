import java.util.Scanner;

 class prog6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a boolean (true or false): ");
        boolean inputBoolean = scanner.nextBoolean();

        System.out.println("You entered: " + inputBoolean);

        // Don't forget to close the scanner to avoid resource leaks
        scanner.close();
    }
}
