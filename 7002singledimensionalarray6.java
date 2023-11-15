import java.util.Scanner;
class Main {
   static int ar[];
   public static void printArray(int ar[])
   {    System.out.println();
    for(int i= 0 ;i<ar.length;i++)
    {
        System.out.print(ar[i]+" ");
    }
   }
   public static void printReverse(int ar[])
   {
        System.out.println();
        for(int i=ar.length-1;i>=0;i--)
        {
            System.out.print(ar[i]+" ");
        }
   }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int x = scanner.nextInt();
        ar = new int[x];
        System.out.print("Enter the elements : ");
        for(int i = 0; i<ar.length;i++)
        {
            ar[i]=scanner.nextInt();
        }
        printArray(ar);
        printReverse(ar);
    }
}
