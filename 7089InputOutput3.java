import java.util.Scanner;

 class prog3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int inputInteger = scanner.nextInt();

        System.out.println("You entered: " + inputInteger);
        
        // Don't forget to close the scanner to avoid resource leaks
        scanner.close();
    }
}
