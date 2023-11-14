class Sup{  
int  x=10;  
}  
class  Sub extends Sup{  
int x=20;  
void printNum(){  
System.out.println("Printing element of subclass :"+x);
System.out.println("Printing element of superclass (using Super ):" +super.x);
}  
}  
class TestSup{  
public static void main(String s[]){  
Sub a=new Sub();  
a.printNum();  
}}  


