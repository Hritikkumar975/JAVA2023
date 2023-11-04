import java.util.Scanner;
class a{
    void tp(int arr1[][]){
        int arr2[][]=new int[arr1.length][arr1.length];
         for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
               arr2[j][i]=arr1[i][j];
            }
        }
         for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                System.out.print(arr2[i][j]);
            }
            System.out.println("");
        }
    }
}
class b{
    public static void main(String[] args) {
        a obj=new a();
        int c,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the column size of matrix : ");
        c=sc.nextInt();
        System.out.println("Enter the row size of matrix : ");
        r=sc.nextInt();
        int arr[][]=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.println("Enter Element at ["+ i+"] ["+j+"] index ");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Your Matrix ");
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Transpose of your Matrix is");
        obj.tp(arr);
        
    }
}