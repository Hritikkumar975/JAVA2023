 class Multiplication {
   public static void main(String args[]) {
      int n = 3;
      int[][] a = { {9, 2, 3}, {2, 6, 4}, {6, 9, 8} };
      int[][] b = { {2, 0, 5}, {4, 4, 3}, {8, 2, 1} };
      int[][] c = new int[n][n];
      System.out.println("Matrix A:");//display matrix1
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            System.out.print(a[i][j] + " ");
         }
         System.out.println();
      }
      System.out.println("Matrix B:");//display matrix2
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            System.out.print(b[i][j] + " ");
         }
         System.out.println();
      }
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++){
            for (int k = 0; k < n; k++) {
               c[i][j] = c[i][j] + a[i][k] * b[k][j];
            }
         }
      }
      System.out.println("The product of two matrices is:");//multiplication of the two matrices
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            System.out.print(c[i][j] + " ");
         }
         System.out.println();
      }
   }
}