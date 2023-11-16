import java.util.Scanner;

class Evenposition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input array elements
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at position " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Print elements at even positions
        System.out.println("\nElements at even positions:");

        for (int i = 1; i < size; i += 2) {
            System.out.println("Position " + (i + 1) + ": " + array[i]);
        }

        scanner.close();
    }
}
