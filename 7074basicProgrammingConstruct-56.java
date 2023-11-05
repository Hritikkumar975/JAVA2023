import java.util.Scanner;
class Bpc56{
   void leap(int l){
    if(l%4==0){
    System.out.println("It is Bpc56 leap year");
}
else{
    System.out.println("It is not a leap year");
    }
   }
}
class b{
     public static void main(String str[]){
Bpc56 obj=new Bpc56();
Scanner sc=new Scanner(System.in);
int lp;
System.out.println("Enter the Year");
lp=sc.nextInt();
obj.leap(lp);


}
}