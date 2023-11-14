import java.util.Scanner;
class AddCharacterToString{
public static void main(String a[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a String:");
String str=s.nextLine();
System.out.println("Enter the character:");
char c=s.next().charAt(0);
String str2=c+str;
System.out.println("Original String:"+str);
System.out.println("Modified String:"+str2);
}
}


