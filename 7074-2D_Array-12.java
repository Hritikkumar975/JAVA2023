// Transpose of a Matrix
import java.util.Scanner;
class Tda{
    void tp(int arr1[][]){
        int arr2[][]=new int[3][3];
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               arr2[j][i]=arr1[i][j];
            }
        }
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
class b{
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        Tda obj=new Tda();
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Enter Element at ["+ i+"] ["+j+"] index ");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Your Matrix ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Transpose of your Matrix is");
        obj.tp(arr);
        
    }
}