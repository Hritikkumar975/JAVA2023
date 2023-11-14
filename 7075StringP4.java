package BCA5Practical;
import java.util.Scanner;
//Program to remove all occurrences of a given character from input String?
public class RemovecharacterString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String from");
		String input = sc.next();
		System.out.println("Enter the Character you want to remove from the String:");
		String c = sc.next();
		String newInput = input.replace(c, "");
		System.out.println("Your String after removing the character from the String : "+newInput);
		
	}

}
