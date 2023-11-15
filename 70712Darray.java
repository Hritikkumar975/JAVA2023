//rename the file


import java.util.Scanner;

public class MatrixPrinter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
          
            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();

          
            System.out.print("Enter the number of columns: ");
            int columns = scanner.nextInt();

            int[][] matrix = new int[rows][columns];

           
            System.out.println("Enter the matrix elements:");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("Enter element at position (" + i + ", " + j + "): ");
                    matrix[i][j] = scanner.nextInt();
                }
            }

            
            System.out.println("Matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}{

}
