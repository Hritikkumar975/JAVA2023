//Java program that throws an exception and catch it using a try-catch block whics arises when an integer.

class triandcheck
{
public static void main(String args[])
{
int a=5,b=0;
int x=0;
try
{             //code which can generate exception
x=a/b;
}
catch(ArithmeticException e){  //catching airthmeticexception object e
//taking corrective actions on the exception
System.out.println("can't divide by zero");
}
System.out.println("value of x="+x);
System.out.println("end of prohram");
}

}