// Program to show Nested try block.
import java.util.Scanner;
class Eh13{
    public static void main(String str[]){
        Scanner sc=new Scanner(System.in);
            int f=0,s=0,i;
            int arr[];
    try{
            System.out.println("Enter the Size of Array : ");
             s=sc.nextInt();
             arr=new int[s];
            for( i=0;i<s;i++){
                System.out.println("Enter element at "+i+ " index of array : ");
                 arr[i]=sc.nextInt();
            }
           try{
            
                System.out.println("Enter the Index number of Array You want to fetch : ");
                 f=sc.nextInt();
                System.out.println("Value at index "+f+ " is : "+arr[f]);
        }
         catch(Exception e){
         System.out.println("Enter Index Number between 0 to (Size-1))");
    }
    }
    catch(Exception e){
         System.out.println("Only numbers are accepted");
    }
}
}