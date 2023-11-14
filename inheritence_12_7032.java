class Animal{  
String color="white";  
public void eat(){System.out.println("Eating");}  }   

class Dog extends Animal{  
String color="black"; 

void printColor(){  
System.out.println(color);//prints color of Dog class  
System.out.println(super.color);//prints color of Animal class  
}  
}  
class inheritence_12_7032{  
public static void main(String args[]){  
Dog d=new Dog();  
d.printColor();  
Animal a= new Animal();
a.eat();


}} 