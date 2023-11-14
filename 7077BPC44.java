import java.util.Scanner;

class Factorial
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
    
        System.out.println("Enter a nber:");
    
        int n = s.nextInt();
    
        long factorial = 1;
    
        for(int i = 1; i <= n; ++i) {
            factorial *= i;
        }
    
        System.out.printf("Factorial of %d = %d", n, factorial);
    }
}
