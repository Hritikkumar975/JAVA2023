import java.util.Scanner;

public class MatrixSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first matrix
        System.out.println("Enter the number of rows and columns for the matrices:");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] matrix1 = new int[rows][columns];

        System.out.println("Enter the elements of the first matrix:");
        inputMatrix(matrix1, scanner);

        // Input for the second matrix
        int[][] matrix2 = new int[rows][columns];

        System.out.println("Enter the elements of the second matrix:");
        inputMatrix(matrix2, scanner);

        // Subtract the matrices
        int[][] resultMatrix = subtractMatrices(matrix1, matrix2);

        // Display the result
        System.out.println("Resultant Matrix after subtraction:");
        displayMatrix(resultMatrix);

        scanner.close();
    }

    // Method to input elements of a matrix
    private static void inputMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to subtract two matrices
    private static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }

    // Method to display a matrix
    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
