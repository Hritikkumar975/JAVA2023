// Program to Swap two Variables.
class Bpc{
    public static void main(String str[]){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter First Number : ");
       int st= sc.nextInt();
        System.out.println("Enter Second Number : ");
       int st1= sc.nextInt();
          int temp=st;
          st=st1;
          st1=temp;
          System.out.println("After Swapping Both Variables :  \n First number :  "+ st+" \nSecond Number :  "+st1);

    }
}
