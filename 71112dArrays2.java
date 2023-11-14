import java.util.Scanner;
class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];

        System.out.println("Enter elements for the first matrix:");
        enterMatrixElements(scanner, matrix1);

        System.out.println("Enter elements for the second matrix:");
        enterMatrixElements(scanner, matrix2);

        int[][] resultMatrix = addMatrices(matrix1, matrix2);

        System.out.println("Resultant Matrix after Addition:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(resultMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }

    private static void enterMatrixElements(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int[][] resultMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }
}
