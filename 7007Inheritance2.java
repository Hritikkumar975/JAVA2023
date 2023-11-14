/*Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print
 "Repairing a car".*/


abstract class Vehicle
{

public abstract void drive();
}


class Car extends Vehicle
{
public void drive()
{
System.out.println("Repairing a car");
} 
 public static void main(String args[])
 {
Car obj1=new Car();
obj1.drive();

 }



}