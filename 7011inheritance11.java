
//Create a program, showing an example of super keyword
//Super keyword is used to access the data member or feild 
// of parent class using " super "keyword.
class B
{
	String str = "hello";
}
class A extends B
{
	String str = "Hi";
	void printStr() 
	{
		System.out.println(str);//print string of A
		System.out.println(super.str);//print string of B
	}
}
public class SuperKeyword  
{
	public static void main(String[] args) 
	{
		A obj = new A();
		obj.printStr();
	}
}