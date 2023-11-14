class test{
public static void main(String st[])
{
System.out.println("main started");
int a=5, b=0,c;
try{
c=a/b;
System.out.println(c);
}
catch(Exception e)
{
System.out.println(e);
}
try{
c=a+b;
System.out.println(c);
}
catch(Exception d)
{
System.out.println("Error");
}
}}