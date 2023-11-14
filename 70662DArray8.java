import java.util.Scanner;
public class OddEvenFrequency{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        // Input: Matrix elements
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        // Calculate frequencies
        int oddFrequency = 0;
        int evenFrequency = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] % 2 == 0) {
                    evenFrequency++;
                } else {
                    oddFrequency++;
                }
            }
        }
        // Output frequencies
        System.out.println("Frequency of odd numbers: " + oddFrequency);
        System.out.println("Frequency of even numbers: " + evenFrequency);
    }
}
