package BCA5Practical;
import java.util.Scanner;
//Enter the float from user using Scanner class
public class FloatUsingScanner
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Float: ");
		Double input = sc.nextDouble();
		System.out.println("Your Float is : "+ input);
	}

}
