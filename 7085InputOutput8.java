import java.util.Scanner;

class LongIntegerInput {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a long integer: ");
        
        
        if (scanner.hasNextLong()) {
          
            long userInput = scanner.nextLong();
            System.out.println("You entered: " + userInput);
        } else {
            System.out.println("Invalid input. Please enter a valid long integer.");
        }

       
        scanner.close();
    }
}
