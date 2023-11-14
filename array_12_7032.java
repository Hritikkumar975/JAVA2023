import java.util.Scanner;

public class array_12_7032{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of rows: ");
        int rows=s.nextInt();
        System.out.println("Enter the number of columns");
        int cols=s.nextInt();
        double matrix[][] = new double[rows][cols];
        System.out.println("enter the elements of matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = s.nextDouble();
                }
                }
                //transposing a matrix using nested loops
                System.out.println("transpose of matrix is: ");
                for (int i = 0; i < cols; i++) {
                    for (int j = 0; j < rows; j++) {
                        System.out.print(matrix[j][i]+"   ");
                    }
                    System.out.println("\n");
                }
                

    }
}