class Vehicle
{
	public void drive(){
	System.out.println("This is class vehicle");
	}
}
class car extends Vehicle{
	public void drive(){
	System.out.println("Reparing a car");
	}
}
public class main{
    public static void main(String str[]){
    car a = new car();
    a.drive();
    }
}