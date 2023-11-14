class LowerTriangularmatrix    
{    
    public static void main(String[] args) {    
    int rows, cols;    
    // matrix x    
        int x[][] = {       
                        {1, 2, 3},    
                        {8, 6, 4},    
                        {4, 5, 6}    
                    };    
              
          //Calculates the number of rows and columns present in the matrix    
          rows = x.length;    
          cols = x[0].length;    
            //check that the matrix is a square one or not
          if(rows != cols){    
              System.out.println("Matrix should be a square matrix");    
          }    
          else {    
              //convert given matrix into lower triangular matrix    
              System.out.println("Lower triangular matrix: ");    
              for(int i = 0; i < rows; i++){    
                  for(int j = 0; j < cols; j++){    
                    if(j > i)    
                      System.out.print("0 ");    
                    else    
                      System.out.print(x[i][j] + " ");    
                }    
                System.out.println();    
            }    
        }    
    }    
}    