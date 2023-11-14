import java.util.*;  
 class A {    
    public static void main(String args[]){       
          int amount;  
        double balance;  
        //Insert amount and balance from console  
        Scanner input = new Scanner (System.in);  
        System.out.println("Enter the amount: ");  
        amount = input.nextInt();  
        System.out.println("Enter the Total Balance: ");  
        balance = input.nextDouble();  
   
        balance=balance-(amount + 0.50);  
  
        System.out.print("Left Balance is: "+balance);  
        input.close();  
        }    
}  