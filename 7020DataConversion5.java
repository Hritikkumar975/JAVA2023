
import java.util.Scanner;
class StringToFloat
{  
public static void main(String args[])
{ 
try
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the string: ");
String s=sc.nextLine();  
float f=Float.parseFloat(s);  
System.out.println(f);  
}
catch(NumberFormatException e)
{
System.out.print("Invalid Input");
}  
}
}