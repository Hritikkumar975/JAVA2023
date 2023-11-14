import java.util.*;

class Duplicate_Number_Exception extends Exception {
    public Duplicate_Number_Exception(String message) {
        super(message);
    }
}

public class ExceptionHandling6 {
    public static void main(String[] args) {
        try {
            int[] numbers = readNumbersFromUser();
            checkDuplicates(numbers);
            System.out.println("No duplicate numbers!");
        } catch (Duplicate_Number_Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int[] readNumbersFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to input? ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];
        System.out.println("Input the integers:");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        scanner.close();
        return numbers;
    }

    public static void checkDuplicates(int[] numbers) throws Duplicate_Number_Exception {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : numbers) {
            if (uniqueNumbers.contains(num)) {
                throw new Duplicate_Number_Exception("Duplicate number found: " + num);
            }
            uniqueNumbers.add(num);
        }
    }
}

